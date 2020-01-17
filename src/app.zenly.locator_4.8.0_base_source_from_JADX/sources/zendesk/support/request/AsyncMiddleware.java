package zendesk.support.request;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import zendesk.suas.C13600a;
import zendesk.suas.Continuation;
import zendesk.suas.Dispatcher;
import zendesk.suas.GetState;
import zendesk.suas.Middleware;

class AsyncMiddleware implements Middleware {
    private final Queue queue;

    interface AsyncAction {
        void actionQueued(Dispatcher dispatcher, GetState getState);

        void execute(Dispatcher dispatcher, GetState getState, Callback callback);
    }

    interface Callback {
        void done();
    }

    interface Item {
        void execute(Callback callback);
    }

    static class Queue {
        private final Callback dispatchCallback = new QueueCallback();
        private final AtomicBoolean isRunning = new AtomicBoolean(false);
        /* access modifiers changed from: private */
        public final java.util.Queue<Item> items = new LinkedList();

        private class QueueCallback implements Callback {
            private QueueCallback() {
            }

            public void done() {
                synchronized (Queue.this.items) {
                    Item item = (Item) Queue.this.items.poll();
                }
                Queue.this.dispatchInternal();
            }
        }

        Queue() {
        }

        /* access modifiers changed from: private */
        public void dispatchInternal() {
            Item item;
            synchronized (this.items) {
                if (!this.items.isEmpty()) {
                    item = (Item) this.items.peek();
                } else {
                    this.isRunning.set(false);
                    item = null;
                }
            }
            if (item != null) {
                item.execute(this.dispatchCallback);
            }
        }

        /* access modifiers changed from: 0000 */
        public void dispatch(Item item) {
            if (item != null) {
                synchronized (this.items) {
                    this.items.add(item);
                }
                if (this.isRunning.compareAndSet(false, true)) {
                    dispatchInternal();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean isRunning() {
            return this.isRunning.get();
        }
    }

    private static class QueueItem implements Item {
        private final AsyncAction asyncAction;
        private final Dispatcher dispatcher;
        private final GetState getState;

        public void execute(Callback callback) {
            this.asyncAction.execute(this.dispatcher, this.getState, callback);
        }

        private QueueItem(AsyncAction asyncAction2, GetState getState2, Dispatcher dispatcher2) {
            this.asyncAction = asyncAction2;
            this.getState = getState2;
            this.dispatcher = dispatcher2;
        }
    }

    AsyncMiddleware(Queue queue2) {
        this.queue = queue2;
    }

    static C13600a createAction(AsyncAction asyncAction) {
        return new C13600a("async_action", asyncAction);
    }

    public void onAction(C13600a<?> aVar, GetState getState, Dispatcher dispatcher, Continuation continuation) {
        AsyncAction asyncAction = (AsyncAction) aVar.getData(AsyncAction.class);
        if (asyncAction != null) {
            asyncAction.actionQueued(dispatcher, getState);
            this.queue.dispatch(new QueueItem(asyncAction, getState, dispatcher));
            return;
        }
        continuation.next(aVar);
    }
}
