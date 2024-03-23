package net.timeprecursor.a_1_20_2.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.timeprecursor.a_1_20_2.A_1_20_2;

public class modblockstateprovider extends BlockStateProvider {
    public modblockstateprovider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, A_1_20_2.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //if blocks needed
    }
    public void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
