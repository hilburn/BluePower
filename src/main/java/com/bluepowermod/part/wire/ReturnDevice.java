package com.bluepowermod.part.wire;

import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.bluepowermod.api.redstone.IBundledDevice;
import com.bluepowermod.api.redstone.IRedstoneDevice;
import com.bluepowermod.api.redstone.RedstoneColor;

public class ReturnDevice implements IRedstoneDevice, IBundledDevice {

    @Override
    public World getWorld() {

        return null;
    }

    @Override
    public int getX() {

        return 0;
    }

    @Override
    public int getY() {

        return 0;
    }

    @Override
    public int getZ() {

        return 0;
    }

    @Override
    public boolean canConnectStraight(IRedstoneDevice device) {

        return false;
    }

    @Override
    public boolean canConnectOpenCorner(IRedstoneDevice device) {

        return false;
    }

    @Override
    public void onConnect(ForgeDirection side, IRedstoneDevice device) {

    }

    @Override
    public void onDisconnect(ForgeDirection side) {

    }

    @Override
    public IRedstoneDevice getDeviceOnSide(ForgeDirection side) {

        return null;
    }

    @Override
    public byte getRedstonePower(ForgeDirection side) {

        return 0;
    }

    @Override
    public void setRedstonePower(ForgeDirection side, byte power) {

    }

    @Override
    public void onRedstoneUpdate() {

    }

    @Override
    public RedstoneColor getInsulationColor() {

        return RedstoneColor.NONE;
    }

    @Override
    public boolean isNormalBlock() {

        return false;
    }

    @Override
    public boolean canConnectBundledStraight(IBundledDevice device) {

        return false;
    }

    @Override
    public boolean canConnectBundledOpenCorner(IBundledDevice device) {

        return false;
    }

    @Override
    public void onConnect(ForgeDirection side, IBundledDevice device) {

    }

    @Override
    public IBundledDevice getBundledDeviceOnSide(ForgeDirection side) {

        return null;
    }

    @Override
    public byte[] getBundledPower(ForgeDirection side) {

        return null;
    }

    @Override
    public void setBundledPower(ForgeDirection side, byte[] power) {

    }

    @Override
    public void onBundledUpdate() {

    }

    @Override
    public RedstoneColor getBundleColor() {

        return null;
    }

    @Override
    public boolean isBundled() {

        return false;
    }

}
