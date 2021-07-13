/* Copyright (c) 2021 KJP12
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */

package net.kjp12.helium.mixins;// Created 2021-02-06T15:30:30

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/**
 * @author KJP12
 * @since ${version}
 **/
@Mixin(PlayerEntity.class)
public interface AccessorPlayerEntity {
    @Accessor
    PlayerInventory getInventory();
}
