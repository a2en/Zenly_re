package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.C13346d;

public final class ServerEventData extends Message<ServerEventData, Builder> {
    public static final ProtoAdapter<ServerEventData> ADAPTER = new ProtoAdapter_ServerEventData();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitCreateAvatarTap#ADAPTER", tag = 36)
    public final BitmojiKitCreateAvatarTap bitmoji_kit_create_avatar_tap;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdate#ADAPTER", tag = 39)
    public final BitmojiKitPermissionUpdate bitmoji_kit_permission_update;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearch#ADAPTER", tag = 33)
    public final BitmojiKitSearch bitmoji_kit_search;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShare#ADAPTER", tag = 32)
    public final BitmojiKitShare bitmoji_kit_share;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkSuccess#ADAPTER", tag = 35)
    public final BitmojiKitSnapchatLinkSuccess bitmoji_kit_snapchat_link_success;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSnapchatLinkTap#ADAPTER", tag = 34)
    public final BitmojiKitSnapchatLinkTap bitmoji_kit_snapchat_link_tap;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerClose#ADAPTER", tag = 31)
    public final BitmojiKitStickerPickerClose bitmoji_kit_sticker_picker_close;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerOpen#ADAPTER", tag = 30)
    public final BitmojiKitStickerPickerOpen bitmoji_kit_sticker_picker_open;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareComplete#ADAPTER", tag = 29)
    public final CreativeKitShareComplete creative_kit_share_complete;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart#ADAPTER", tag = 28)
    public final CreativeKitShareStart creative_kit_share_start;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete#ADAPTER", tag = 38)
    public final LoginKitAuthComplete login_kit_auth_complete;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart#ADAPTER", tag = 37)
    public final LoginKitAuthStart login_kit_auth_start;

    public static final class Builder extends com.squareup.wire.Message.Builder<ServerEventData, Builder> {
        public BitmojiKitCreateAvatarTap bitmoji_kit_create_avatar_tap;
        public BitmojiKitPermissionUpdate bitmoji_kit_permission_update;
        public BitmojiKitSearch bitmoji_kit_search;
        public BitmojiKitShare bitmoji_kit_share;
        public BitmojiKitSnapchatLinkSuccess bitmoji_kit_snapchat_link_success;
        public BitmojiKitSnapchatLinkTap bitmoji_kit_snapchat_link_tap;
        public BitmojiKitStickerPickerClose bitmoji_kit_sticker_picker_close;
        public BitmojiKitStickerPickerOpen bitmoji_kit_sticker_picker_open;
        public CreativeKitShareComplete creative_kit_share_complete;
        public CreativeKitShareStart creative_kit_share_start;
        public LoginKitAuthComplete login_kit_auth_complete;
        public LoginKitAuthStart login_kit_auth_start;

        public Builder bitmoji_kit_create_avatar_tap(BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap) {
            this.bitmoji_kit_create_avatar_tap = bitmojiKitCreateAvatarTap;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder bitmoji_kit_permission_update(BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) {
            this.bitmoji_kit_permission_update = bitmojiKitPermissionUpdate;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            return this;
        }

        public Builder bitmoji_kit_search(BitmojiKitSearch bitmojiKitSearch) {
            this.bitmoji_kit_search = bitmojiKitSearch;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder bitmoji_kit_share(BitmojiKitShare bitmojiKitShare) {
            this.bitmoji_kit_share = bitmojiKitShare;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder bitmoji_kit_snapchat_link_success(BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess) {
            this.bitmoji_kit_snapchat_link_success = bitmojiKitSnapchatLinkSuccess;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder bitmoji_kit_snapchat_link_tap(BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
            this.bitmoji_kit_snapchat_link_tap = bitmojiKitSnapchatLinkTap;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder bitmoji_kit_sticker_picker_close(BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose) {
            this.bitmoji_kit_sticker_picker_close = bitmojiKitStickerPickerClose;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder bitmoji_kit_sticker_picker_open(BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
            this.bitmoji_kit_sticker_picker_open = bitmojiKitStickerPickerOpen;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder creative_kit_share_complete(CreativeKitShareComplete creativeKitShareComplete) {
            this.creative_kit_share_complete = creativeKitShareComplete;
            this.creative_kit_share_start = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder creative_kit_share_start(CreativeKitShareStart creativeKitShareStart) {
            this.creative_kit_share_start = creativeKitShareStart;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder login_kit_auth_complete(LoginKitAuthComplete loginKitAuthComplete) {
            this.login_kit_auth_complete = loginKitAuthComplete;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_start = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public Builder login_kit_auth_start(LoginKitAuthStart loginKitAuthStart) {
            this.login_kit_auth_start = loginKitAuthStart;
            this.creative_kit_share_start = null;
            this.creative_kit_share_complete = null;
            this.bitmoji_kit_sticker_picker_open = null;
            this.bitmoji_kit_sticker_picker_close = null;
            this.bitmoji_kit_share = null;
            this.bitmoji_kit_search = null;
            this.bitmoji_kit_snapchat_link_tap = null;
            this.bitmoji_kit_snapchat_link_success = null;
            this.bitmoji_kit_create_avatar_tap = null;
            this.login_kit_auth_complete = null;
            this.bitmoji_kit_permission_update = null;
            return this;
        }

        public ServerEventData build() {
            ServerEventData serverEventData = new ServerEventData(this.creative_kit_share_start, this.creative_kit_share_complete, this.bitmoji_kit_sticker_picker_open, this.bitmoji_kit_sticker_picker_close, this.bitmoji_kit_share, this.bitmoji_kit_search, this.bitmoji_kit_snapchat_link_tap, this.bitmoji_kit_snapchat_link_success, this.bitmoji_kit_create_avatar_tap, this.login_kit_auth_start, this.login_kit_auth_complete, this.bitmoji_kit_permission_update, super.buildUnknownFields());
            return serverEventData;
        }
    }

    private static final class ProtoAdapter_ServerEventData extends ProtoAdapter<ServerEventData> {
        public ProtoAdapter_ServerEventData() {
            super(FieldEncoding.LENGTH_DELIMITED, ServerEventData.class);
        }

        public ServerEventData decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 28:
                            builder.creative_kit_share_start((CreativeKitShareStart) CreativeKitShareStart.ADAPTER.decode(protoReader));
                            break;
                        case 29:
                            builder.creative_kit_share_complete((CreativeKitShareComplete) CreativeKitShareComplete.ADAPTER.decode(protoReader));
                            break;
                        case 30:
                            builder.bitmoji_kit_sticker_picker_open((BitmojiKitStickerPickerOpen) BitmojiKitStickerPickerOpen.ADAPTER.decode(protoReader));
                            break;
                        case 31:
                            builder.bitmoji_kit_sticker_picker_close((BitmojiKitStickerPickerClose) BitmojiKitStickerPickerClose.ADAPTER.decode(protoReader));
                            break;
                        case 32:
                            builder.bitmoji_kit_share((BitmojiKitShare) BitmojiKitShare.ADAPTER.decode(protoReader));
                            break;
                        case 33:
                            builder.bitmoji_kit_search((BitmojiKitSearch) BitmojiKitSearch.ADAPTER.decode(protoReader));
                            break;
                        case 34:
                            builder.bitmoji_kit_snapchat_link_tap((BitmojiKitSnapchatLinkTap) BitmojiKitSnapchatLinkTap.ADAPTER.decode(protoReader));
                            break;
                        case 35:
                            builder.bitmoji_kit_snapchat_link_success((BitmojiKitSnapchatLinkSuccess) BitmojiKitSnapchatLinkSuccess.ADAPTER.decode(protoReader));
                            break;
                        case 36:
                            builder.bitmoji_kit_create_avatar_tap((BitmojiKitCreateAvatarTap) BitmojiKitCreateAvatarTap.ADAPTER.decode(protoReader));
                            break;
                        case 37:
                            builder.login_kit_auth_start((LoginKitAuthStart) LoginKitAuthStart.ADAPTER.decode(protoReader));
                            break;
                        case 38:
                            builder.login_kit_auth_complete((LoginKitAuthComplete) LoginKitAuthComplete.ADAPTER.decode(protoReader));
                            break;
                        case 39:
                            builder.bitmoji_kit_permission_update((BitmojiKitPermissionUpdate) BitmojiKitPermissionUpdate.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ServerEventData serverEventData) throws IOException {
            CreativeKitShareStart.ADAPTER.encodeWithTag(protoWriter, 28, serverEventData.creative_kit_share_start);
            CreativeKitShareComplete.ADAPTER.encodeWithTag(protoWriter, 29, serverEventData.creative_kit_share_complete);
            BitmojiKitStickerPickerOpen.ADAPTER.encodeWithTag(protoWriter, 30, serverEventData.bitmoji_kit_sticker_picker_open);
            BitmojiKitStickerPickerClose.ADAPTER.encodeWithTag(protoWriter, 31, serverEventData.bitmoji_kit_sticker_picker_close);
            BitmojiKitShare.ADAPTER.encodeWithTag(protoWriter, 32, serverEventData.bitmoji_kit_share);
            BitmojiKitSearch.ADAPTER.encodeWithTag(protoWriter, 33, serverEventData.bitmoji_kit_search);
            BitmojiKitSnapchatLinkTap.ADAPTER.encodeWithTag(protoWriter, 34, serverEventData.bitmoji_kit_snapchat_link_tap);
            BitmojiKitSnapchatLinkSuccess.ADAPTER.encodeWithTag(protoWriter, 35, serverEventData.bitmoji_kit_snapchat_link_success);
            BitmojiKitCreateAvatarTap.ADAPTER.encodeWithTag(protoWriter, 36, serverEventData.bitmoji_kit_create_avatar_tap);
            LoginKitAuthStart.ADAPTER.encodeWithTag(protoWriter, 37, serverEventData.login_kit_auth_start);
            LoginKitAuthComplete.ADAPTER.encodeWithTag(protoWriter, 38, serverEventData.login_kit_auth_complete);
            BitmojiKitPermissionUpdate.ADAPTER.encodeWithTag(protoWriter, 39, serverEventData.bitmoji_kit_permission_update);
            protoWriter.writeBytes(serverEventData.unknownFields());
        }

        public int encodedSize(ServerEventData serverEventData) {
            return CreativeKitShareStart.ADAPTER.encodedSizeWithTag(28, serverEventData.creative_kit_share_start) + CreativeKitShareComplete.ADAPTER.encodedSizeWithTag(29, serverEventData.creative_kit_share_complete) + BitmojiKitStickerPickerOpen.ADAPTER.encodedSizeWithTag(30, serverEventData.bitmoji_kit_sticker_picker_open) + BitmojiKitStickerPickerClose.ADAPTER.encodedSizeWithTag(31, serverEventData.bitmoji_kit_sticker_picker_close) + BitmojiKitShare.ADAPTER.encodedSizeWithTag(32, serverEventData.bitmoji_kit_share) + BitmojiKitSearch.ADAPTER.encodedSizeWithTag(33, serverEventData.bitmoji_kit_search) + BitmojiKitSnapchatLinkTap.ADAPTER.encodedSizeWithTag(34, serverEventData.bitmoji_kit_snapchat_link_tap) + BitmojiKitSnapchatLinkSuccess.ADAPTER.encodedSizeWithTag(35, serverEventData.bitmoji_kit_snapchat_link_success) + BitmojiKitCreateAvatarTap.ADAPTER.encodedSizeWithTag(36, serverEventData.bitmoji_kit_create_avatar_tap) + LoginKitAuthStart.ADAPTER.encodedSizeWithTag(37, serverEventData.login_kit_auth_start) + LoginKitAuthComplete.ADAPTER.encodedSizeWithTag(38, serverEventData.login_kit_auth_complete) + BitmojiKitPermissionUpdate.ADAPTER.encodedSizeWithTag(39, serverEventData.bitmoji_kit_permission_update) + serverEventData.unknownFields().mo38528g();
        }

        public ServerEventData redact(ServerEventData serverEventData) {
            Builder newBuilder = serverEventData.newBuilder();
            CreativeKitShareStart creativeKitShareStart = newBuilder.creative_kit_share_start;
            if (creativeKitShareStart != null) {
                newBuilder.creative_kit_share_start = (CreativeKitShareStart) CreativeKitShareStart.ADAPTER.redact(creativeKitShareStart);
            }
            CreativeKitShareComplete creativeKitShareComplete = newBuilder.creative_kit_share_complete;
            if (creativeKitShareComplete != null) {
                newBuilder.creative_kit_share_complete = (CreativeKitShareComplete) CreativeKitShareComplete.ADAPTER.redact(creativeKitShareComplete);
            }
            BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen = newBuilder.bitmoji_kit_sticker_picker_open;
            if (bitmojiKitStickerPickerOpen != null) {
                newBuilder.bitmoji_kit_sticker_picker_open = (BitmojiKitStickerPickerOpen) BitmojiKitStickerPickerOpen.ADAPTER.redact(bitmojiKitStickerPickerOpen);
            }
            BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose = newBuilder.bitmoji_kit_sticker_picker_close;
            if (bitmojiKitStickerPickerClose != null) {
                newBuilder.bitmoji_kit_sticker_picker_close = (BitmojiKitStickerPickerClose) BitmojiKitStickerPickerClose.ADAPTER.redact(bitmojiKitStickerPickerClose);
            }
            BitmojiKitShare bitmojiKitShare = newBuilder.bitmoji_kit_share;
            if (bitmojiKitShare != null) {
                newBuilder.bitmoji_kit_share = (BitmojiKitShare) BitmojiKitShare.ADAPTER.redact(bitmojiKitShare);
            }
            BitmojiKitSearch bitmojiKitSearch = newBuilder.bitmoji_kit_search;
            if (bitmojiKitSearch != null) {
                newBuilder.bitmoji_kit_search = (BitmojiKitSearch) BitmojiKitSearch.ADAPTER.redact(bitmojiKitSearch);
            }
            BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap = newBuilder.bitmoji_kit_snapchat_link_tap;
            if (bitmojiKitSnapchatLinkTap != null) {
                newBuilder.bitmoji_kit_snapchat_link_tap = (BitmojiKitSnapchatLinkTap) BitmojiKitSnapchatLinkTap.ADAPTER.redact(bitmojiKitSnapchatLinkTap);
            }
            BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess = newBuilder.bitmoji_kit_snapchat_link_success;
            if (bitmojiKitSnapchatLinkSuccess != null) {
                newBuilder.bitmoji_kit_snapchat_link_success = (BitmojiKitSnapchatLinkSuccess) BitmojiKitSnapchatLinkSuccess.ADAPTER.redact(bitmojiKitSnapchatLinkSuccess);
            }
            BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap = newBuilder.bitmoji_kit_create_avatar_tap;
            if (bitmojiKitCreateAvatarTap != null) {
                newBuilder.bitmoji_kit_create_avatar_tap = (BitmojiKitCreateAvatarTap) BitmojiKitCreateAvatarTap.ADAPTER.redact(bitmojiKitCreateAvatarTap);
            }
            LoginKitAuthStart loginKitAuthStart = newBuilder.login_kit_auth_start;
            if (loginKitAuthStart != null) {
                newBuilder.login_kit_auth_start = (LoginKitAuthStart) LoginKitAuthStart.ADAPTER.redact(loginKitAuthStart);
            }
            LoginKitAuthComplete loginKitAuthComplete = newBuilder.login_kit_auth_complete;
            if (loginKitAuthComplete != null) {
                newBuilder.login_kit_auth_complete = (LoginKitAuthComplete) LoginKitAuthComplete.ADAPTER.redact(loginKitAuthComplete);
            }
            BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate = newBuilder.bitmoji_kit_permission_update;
            if (bitmojiKitPermissionUpdate != null) {
                newBuilder.bitmoji_kit_permission_update = (BitmojiKitPermissionUpdate) BitmojiKitPermissionUpdate.ADAPTER.redact(bitmojiKitPermissionUpdate);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public ServerEventData(CreativeKitShareStart creativeKitShareStart, CreativeKitShareComplete creativeKitShareComplete, BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen, BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose, BitmojiKitShare bitmojiKitShare, BitmojiKitSearch bitmojiKitSearch, BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap, BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess, BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap, LoginKitAuthStart loginKitAuthStart, LoginKitAuthComplete loginKitAuthComplete, BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) {
        this(creativeKitShareStart, creativeKitShareComplete, bitmojiKitStickerPickerOpen, bitmojiKitStickerPickerClose, bitmojiKitShare, bitmojiKitSearch, bitmojiKitSnapchatLinkTap, bitmojiKitSnapchatLinkSuccess, bitmojiKitCreateAvatarTap, loginKitAuthStart, loginKitAuthComplete, bitmojiKitPermissionUpdate, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServerEventData)) {
            return false;
        }
        ServerEventData serverEventData = (ServerEventData) obj;
        if (!unknownFields().equals(serverEventData.unknownFields()) || !Internal.equals(this.creative_kit_share_start, serverEventData.creative_kit_share_start) || !Internal.equals(this.creative_kit_share_complete, serverEventData.creative_kit_share_complete) || !Internal.equals(this.bitmoji_kit_sticker_picker_open, serverEventData.bitmoji_kit_sticker_picker_open) || !Internal.equals(this.bitmoji_kit_sticker_picker_close, serverEventData.bitmoji_kit_sticker_picker_close) || !Internal.equals(this.bitmoji_kit_share, serverEventData.bitmoji_kit_share) || !Internal.equals(this.bitmoji_kit_search, serverEventData.bitmoji_kit_search) || !Internal.equals(this.bitmoji_kit_snapchat_link_tap, serverEventData.bitmoji_kit_snapchat_link_tap) || !Internal.equals(this.bitmoji_kit_snapchat_link_success, serverEventData.bitmoji_kit_snapchat_link_success) || !Internal.equals(this.bitmoji_kit_create_avatar_tap, serverEventData.bitmoji_kit_create_avatar_tap) || !Internal.equals(this.login_kit_auth_start, serverEventData.login_kit_auth_start) || !Internal.equals(this.login_kit_auth_complete, serverEventData.login_kit_auth_complete) || !Internal.equals(this.bitmoji_kit_permission_update, serverEventData.bitmoji_kit_permission_update)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CreativeKitShareStart creativeKitShareStart = this.creative_kit_share_start;
        int i2 = 0;
        int hashCode2 = (hashCode + (creativeKitShareStart != null ? creativeKitShareStart.hashCode() : 0)) * 37;
        CreativeKitShareComplete creativeKitShareComplete = this.creative_kit_share_complete;
        int hashCode3 = (hashCode2 + (creativeKitShareComplete != null ? creativeKitShareComplete.hashCode() : 0)) * 37;
        BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen = this.bitmoji_kit_sticker_picker_open;
        int hashCode4 = (hashCode3 + (bitmojiKitStickerPickerOpen != null ? bitmojiKitStickerPickerOpen.hashCode() : 0)) * 37;
        BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose = this.bitmoji_kit_sticker_picker_close;
        int hashCode5 = (hashCode4 + (bitmojiKitStickerPickerClose != null ? bitmojiKitStickerPickerClose.hashCode() : 0)) * 37;
        BitmojiKitShare bitmojiKitShare = this.bitmoji_kit_share;
        int hashCode6 = (hashCode5 + (bitmojiKitShare != null ? bitmojiKitShare.hashCode() : 0)) * 37;
        BitmojiKitSearch bitmojiKitSearch = this.bitmoji_kit_search;
        int hashCode7 = (hashCode6 + (bitmojiKitSearch != null ? bitmojiKitSearch.hashCode() : 0)) * 37;
        BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap = this.bitmoji_kit_snapchat_link_tap;
        int hashCode8 = (hashCode7 + (bitmojiKitSnapchatLinkTap != null ? bitmojiKitSnapchatLinkTap.hashCode() : 0)) * 37;
        BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess = this.bitmoji_kit_snapchat_link_success;
        int hashCode9 = (hashCode8 + (bitmojiKitSnapchatLinkSuccess != null ? bitmojiKitSnapchatLinkSuccess.hashCode() : 0)) * 37;
        BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap = this.bitmoji_kit_create_avatar_tap;
        int hashCode10 = (hashCode9 + (bitmojiKitCreateAvatarTap != null ? bitmojiKitCreateAvatarTap.hashCode() : 0)) * 37;
        LoginKitAuthStart loginKitAuthStart = this.login_kit_auth_start;
        int hashCode11 = (hashCode10 + (loginKitAuthStart != null ? loginKitAuthStart.hashCode() : 0)) * 37;
        LoginKitAuthComplete loginKitAuthComplete = this.login_kit_auth_complete;
        int hashCode12 = (hashCode11 + (loginKitAuthComplete != null ? loginKitAuthComplete.hashCode() : 0)) * 37;
        BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate = this.bitmoji_kit_permission_update;
        if (bitmojiKitPermissionUpdate != null) {
            i2 = bitmojiKitPermissionUpdate.hashCode();
        }
        int i3 = hashCode12 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.creative_kit_share_start != null) {
            sb.append(", creative_kit_share_start=");
            sb.append(this.creative_kit_share_start);
        }
        if (this.creative_kit_share_complete != null) {
            sb.append(", creative_kit_share_complete=");
            sb.append(this.creative_kit_share_complete);
        }
        if (this.bitmoji_kit_sticker_picker_open != null) {
            sb.append(", bitmoji_kit_sticker_picker_open=");
            sb.append(this.bitmoji_kit_sticker_picker_open);
        }
        if (this.bitmoji_kit_sticker_picker_close != null) {
            sb.append(", bitmoji_kit_sticker_picker_close=");
            sb.append(this.bitmoji_kit_sticker_picker_close);
        }
        if (this.bitmoji_kit_share != null) {
            sb.append(", bitmoji_kit_share=");
            sb.append(this.bitmoji_kit_share);
        }
        if (this.bitmoji_kit_search != null) {
            sb.append(", bitmoji_kit_search=");
            sb.append(this.bitmoji_kit_search);
        }
        if (this.bitmoji_kit_snapchat_link_tap != null) {
            sb.append(", bitmoji_kit_snapchat_link_tap=");
            sb.append(this.bitmoji_kit_snapchat_link_tap);
        }
        if (this.bitmoji_kit_snapchat_link_success != null) {
            sb.append(", bitmoji_kit_snapchat_link_success=");
            sb.append(this.bitmoji_kit_snapchat_link_success);
        }
        if (this.bitmoji_kit_create_avatar_tap != null) {
            sb.append(", bitmoji_kit_create_avatar_tap=");
            sb.append(this.bitmoji_kit_create_avatar_tap);
        }
        if (this.login_kit_auth_start != null) {
            sb.append(", login_kit_auth_start=");
            sb.append(this.login_kit_auth_start);
        }
        if (this.login_kit_auth_complete != null) {
            sb.append(", login_kit_auth_complete=");
            sb.append(this.login_kit_auth_complete);
        }
        if (this.bitmoji_kit_permission_update != null) {
            sb.append(", bitmoji_kit_permission_update=");
            sb.append(this.bitmoji_kit_permission_update);
        }
        StringBuilder replace = sb.replace(0, 2, "ServerEventData{");
        replace.append('}');
        return replace.toString();
    }

    public ServerEventData(CreativeKitShareStart creativeKitShareStart, CreativeKitShareComplete creativeKitShareComplete, BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen, BitmojiKitStickerPickerClose bitmojiKitStickerPickerClose, BitmojiKitShare bitmojiKitShare, BitmojiKitSearch bitmojiKitSearch, BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap, BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess, BitmojiKitCreateAvatarTap bitmojiKitCreateAvatarTap, LoginKitAuthStart loginKitAuthStart, LoginKitAuthComplete loginKitAuthComplete, BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate, C13346d dVar) {
        super(ADAPTER, dVar);
        if (Internal.countNonNull(creativeKitShareStart, creativeKitShareComplete, bitmojiKitStickerPickerOpen, bitmojiKitStickerPickerClose, bitmojiKitShare, bitmojiKitSearch, bitmojiKitSnapchatLinkTap, bitmojiKitSnapchatLinkSuccess, bitmojiKitCreateAvatarTap, loginKitAuthStart, loginKitAuthComplete, bitmojiKitPermissionUpdate) <= 1) {
            this.creative_kit_share_start = creativeKitShareStart;
            this.creative_kit_share_complete = creativeKitShareComplete;
            this.bitmoji_kit_sticker_picker_open = bitmojiKitStickerPickerOpen;
            this.bitmoji_kit_sticker_picker_close = bitmojiKitStickerPickerClose;
            this.bitmoji_kit_share = bitmojiKitShare;
            this.bitmoji_kit_search = bitmojiKitSearch;
            this.bitmoji_kit_snapchat_link_tap = bitmojiKitSnapchatLinkTap;
            this.bitmoji_kit_snapchat_link_success = bitmojiKitSnapchatLinkSuccess;
            this.bitmoji_kit_create_avatar_tap = bitmojiKitCreateAvatarTap;
            this.login_kit_auth_start = loginKitAuthStart;
            this.login_kit_auth_complete = loginKitAuthComplete;
            this.bitmoji_kit_permission_update = bitmojiKitPermissionUpdate;
            return;
        }
        throw new IllegalArgumentException("at most one of creative_kit_share_start, creative_kit_share_complete, bitmoji_kit_sticker_picker_open, bitmoji_kit_sticker_picker_close, bitmoji_kit_share, bitmoji_kit_search, bitmoji_kit_snapchat_link_tap, bitmoji_kit_snapchat_link_success, bitmoji_kit_create_avatar_tap, login_kit_auth_start, login_kit_auth_complete, bitmoji_kit_permission_update may be non-null");
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.creative_kit_share_start = this.creative_kit_share_start;
        builder.creative_kit_share_complete = this.creative_kit_share_complete;
        builder.bitmoji_kit_sticker_picker_open = this.bitmoji_kit_sticker_picker_open;
        builder.bitmoji_kit_sticker_picker_close = this.bitmoji_kit_sticker_picker_close;
        builder.bitmoji_kit_share = this.bitmoji_kit_share;
        builder.bitmoji_kit_search = this.bitmoji_kit_search;
        builder.bitmoji_kit_snapchat_link_tap = this.bitmoji_kit_snapchat_link_tap;
        builder.bitmoji_kit_snapchat_link_success = this.bitmoji_kit_snapchat_link_success;
        builder.bitmoji_kit_create_avatar_tap = this.bitmoji_kit_create_avatar_tap;
        builder.login_kit_auth_start = this.login_kit_auth_start;
        builder.login_kit_auth_complete = this.login_kit_auth_complete;
        builder.bitmoji_kit_permission_update = this.bitmoji_kit_permission_update;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
