package net.kjp12.plymouth.common;// Created 2022-26-05T00:18:47

import net.minecraft.text.KeybindTextContent;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.MutableText;
import net.minecraft.text.TranslatableTextContent;

/**
 * Helper class to mitigate the migration effort to 1.19
 *
 * @author KJP12
 * @since ${version}
 **/
public final class TextHelper {
    public static MutableText literal(String string) {
        return MutableText.of(new LiteralTextContent(string));
    }

    public static MutableText translatable(String key) {
        return MutableText.of(new TranslatableTextContent(key));
    }

    public static MutableText translatable(String key, Object... args) {
        return MutableText.of(new TranslatableTextContent(key, args));
    }

    public static MutableText keybind(String key) {
        return MutableText.of(new KeybindTextContent(key));
    }
}