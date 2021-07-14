/* Copyright (c) 2021 KJP12
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */

package net.kjp12.helium.mixins;// Created 2021-02-06T15:27:08

import net.minecraft.item.map.MapState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.List;

/**
 * @author KJP12
 * @since ${version}
 **/
@Mixin(MapState.class)
public interface AccessorMapState {
    @Accessor
    List<MapState.PlayerUpdateTracker> getUpdateTrackers();

    @Invoker
    void callMarkDirty(int x, int y);
}
