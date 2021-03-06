/*
 * This file is part of Blue Power.
 *
 *     Blue Power is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Blue Power is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Blue Power.  If not, see <http://www.gnu.org/licenses/>
 */

package com.bluepowermod.api.wireless;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;

public interface IWirelessManager {

    public List<IRedstoneFrequency> getRedstoneFrequencies();

    public List<IBundledFrequency> getBundledFrequencies();

    public List<IRedstoneFrequency> getAvailableRedstoneFrequencies(EntityPlayer player);

    public List<IBundledFrequency> getAvailableBundledFrequencies(EntityPlayer player);

    public IRedstoneFrequency registerRedstoneFrequency(EntityPlayer owner, String frequency, com.bluepowermod.api.misc.Accessibility accessibility);

    public IBundledFrequency registerBundledFrequency(EntityPlayer owner, String frequency, com.bluepowermod.api.misc.Accessibility accessibility);

    public IFrequency registerFrequency(EntityPlayer owner, String frequency, com.bluepowermod.api.misc.Accessibility accessibility, boolean isBundled);

    public void unregisterFrequency(IFrequency frequency);

}
