package app.zenly.locator.cards.framework;

import app.zenly.locator.cards.models.Card;

public interface CardFragmentFactory {
    CardFragment make(Card card);
}
