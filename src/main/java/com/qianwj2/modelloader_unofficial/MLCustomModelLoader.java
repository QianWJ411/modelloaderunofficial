package com.qianwj2.modelloader_unofficial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.client.renderer.block.model.ItemOverrides;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.*;
import net.minecraft.client.renderer.texture.*;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.*;
import net.minecraft.core.Direction;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.javafmlmod.FMLModContainer;
import net.neoforged.neoforge.client.model.geometry.*;
import org.jetbrains.annotations.Nullable;
import java.util.*;
import java.util.function.Function;

public class MLCustomModelLoader implements IGeometryLoader<MLCustomModelLoader>, IUnbakedGeometry<MLCustomModelLoader> {
    public static final MLCustomModelLoader INSTANCE = new MLCustomModelLoader() ;
    public static final ResourceLocation ID =ResourceLocation.fromNamespaceAndPath("modelloaderunofficial","My Custom_loader");
        @Override
        public MLCustomModelLoader read(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return null;
        }

        @Override
        public BakedModel bake(IGeometryBakingContext iGeometryBakingContext, ModelBaker modelBaker, Function<Material, TextureAtlasSprite> function, ModelState modelState, ItemOverrides itemOverrides) {
            return null;
        }
    }
