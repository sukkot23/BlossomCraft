package com.flora.api;

import java.util.Map;

import com.google.common.collect.Maps;

public enum Name
{
	/*
	 * THIS MINECRAFT VERSION 1.15.2
	 * LANG TYPE : KO_KR
	 */
	
/*---  BLOCK  ---*/
	AIR("공기", 0),
	STONE("돌", 1),
		GRANITE("화강암", 1, 1),
		POLISHED_GRANITE("윤나는 화강암", 1, 2),
		DIORITE("섬록암", 1, 3),
		POLISHED_DIORITE("윤나는 섬록암", 1, 4),
		ANDESITE("안산암", 1, 5),
		POLISHED_ANDESITE("윤나는 안산암", 1, 6),
	GRASS_BLOCK("잔디 블록" ,2),
	DIRT("흙", 3),
		COARSE_DIRT("거친 흙", 3, 1),
		PODZOL("회백토", 3, 2),
	COBBLESTONE("조약돌", 4),
	OAK_PLANKS("참나무 판자", 5),
		SPRUCE_PLANKS("가문비나무 판자", 5, 1),
		BIRCH_PLANKS("자작나무 판자", 5, 2),
		JUNGLE_PLANKS("정글나무 판자", 5, 3),
		ACACIA_PLANKS("아카시아나무 판자", 5, 4),
		DARK_OAK_PLANKS("짙은 참나무 판자", 5, 5),
	OAK_SAPLING("참나무 묘목", 6),
		SPRUCE_SAPLING("가문비나무 묘목", 6, 1),
		BIRCH_SAPLING("자작나무 묘목", 6, 2),
		JUNGLE_SAPLING("정글나무 묘목", 6, 3),
		ACACIA_SAPLING("아카시아나무 묘목", 6, 4),
		DARK_OAK_SAPLING("짙은 참나무 묘목", 6, 5),
	BEDROCK("기반암", 7),
	//WATER("흐르는 물", 8),
	//STATIONARY_WATER("물", 9),
	//LAVA("흐르는 용암", 10),
	//STATIONARY_LAVA("용암", 11),
	SAND("모래", 12),
		RED_SAND("붉은 모래", 12, 1),
	GRAVEL("자갈", 13),
	GOLD_ORE("금광석", 14),
	IRON_ORE("철광석", 15),
	COAL_ORE("석탄 광석", 16),
	OAK_LOG("참나무 원목", 17),
		SPRUCE_LOG("가문비나무 원목", 17, 1),
		BIRCH_LOG("자작나무 원목", 17, 2),
		JUNGLE_LOG("정글나무 원목", 17, 3),
		STRIPPED_OAK_LOG("껍질 벗긴 참나무 원목"),
		STRIPPED_SPRUCE_LOG("껍질 벗긴 가문비나무 원목"),
		STRIPPED_BIRCH_LOG("껍질 벗긴 자작나무 원목"),
		STRIPPED_JUNGLE_LOG("껍질 벗긴 정글나무 원목"),
		STRIPPED_ACACIA_LOG("껍질 벗긴 아카시아나무 원목"),
		STRIPPED_DARK_OAK_LOG("껍질 벗긴 짙은 참나무 원목"),
		STRIPPED_OAK_WOOD("껍질 벗긴 참나무"),
		STRIPPED_SPRUCE_WOOD("껍질 벗긴 가문비나무"),
		STRIPPED_BIRCH_WOOD("껍질 벗긴 자작나무"),
		STRIPPED_JUNGLE_WOOD("껍질 벗긴 정글나무"),
		STRIPPED_ACACIA_WOOD("껍질 벗긴 아카시아나무"),
		STRIPPED_DARK_OAK_WOOD("껍질 벗긴 짙은 참나무"),
		OAK_WOOD("참나무"),
		SPRUCE_WOOD("가문비나무"),
		BIRCH_WOOD("자작나무"),
		JUNGLE_WOOD("정글나무"),
		ACACIA_WOOD("아카시아나무"),
		DARK_OAK_WOOD("짙은 참나무"),
	OAK_LEAVES("참나무 잎", 18),
		SPRUCE_LEAVES("가문비나무 잎", 18, 1),
		BIRCH_LEAVES("자작나무 잎", 18, 2),
		JUNGLE_LEAVES("정글나무 잎", 18, 3),
	SPONGE("스펀지", 19),
		WET_SPONGE("젖은 스펀지", 19, 1),
	GLASS("유리", 20),
	LAPIS_ORE("청금석 원석", 21),
	LAPIS_BLOCK("청금석 블록", 22),
	DISPENSER("발사기", 23),
	SANDSTONE("사암", 24),
		CHISELED_SANDSTONE("조각된 사암", 24, 1),
		CUT_SANDSTONE("깍인 사암", 24, 2),
	NOTE_BLOCK("소리 블록", 25),
	//BED_BLOCK("침대", 26),
	POWERED_RAIL("전동 레일", 27),
	DETECTOR_RAIL("탐지 레일", 28),
	STICKY_PISTON("끈끈이 피스톤", 29),
	COBWEB("거미줄", 30),
	DEAD_SHRUB("덤불", 31),
		GRASS("잔디", 31, 1),
		FERN("고사리", 31, 2),
	DEAD_BUSH("마른덤불", 32),
	PISTON("피스톤", 33),
	//PISTON_EXTENSION("피스톤 확장", 34),
	WHITE_WOOL("하얀색 양털", 35),
		ORANGE_WOOL("주황색 양털", 35, 1),
		MAGENTA_WOOL("자홍색 양털", 35, 2),
		LIGHT_BLUE_WOOL("하늘색 양털", 35, 3),
		YELLOW_WOOL("노란색 양털", 35, 4),
		LIME_WOOL("연두색 양털", 35, 5),
		PINK_WOOL("분홍색 양털", 35, 6),
		GRAY_WOOL("회색 양털", 35, 7),
		LIGHT_GRAY_WOOL("회백색 양털", 35, 8),
		CYAN_WOOL("청록색 양털", 35, 9),
		PURPLE_WOOL("보라색 양털", 35, 10),
		BLUE_WOOL("파란색 양털", 35, 11),
		BROWN_WOOL("갈색 양털", 35, 12),
		GREEN_WOOL("초록색 양털", 35, 13),
		RED_WOOL("빨간색 양털", 35, 14),
		BLACK_WOOL("검은색 양털", 35, 15),
	//PISTON_MOVING_PIECE("피스톤 동체", 36),
	DANDELION("민들레", 37),
	POPPY("양귀비", 38),
		BLUE_ORCHID("파란색 난초", 38, 1),
		ALLIUM("파꽃", 38, 2),
		AZURE_BLUET("선애기별꽃", 38, 3),
		RED_TULIP("빨간색 튤립", 38, 4),
		ORANGE_TULIP("주황색 튤립", 38, 5),
		WHITE_TULIP("하얀색 튤립", 38, 6),
		PINK_TULIP("분홍색 튤립", 38, 7),
		OXEYE_DAISY("데이지", 38, 8),
	BROWN_MUSHROOM("갈색 버섯", 39),
	RED_MUSHROOM("빨간색 버섯", 40),
	GOLD_BLOCK("금블록", 41),
	IRON_BLOCK("철블록", 42),
	//DOUBLE_STONE_SLAB("매끄러운 돌 한 블록", 43),
	//	DOUBLE_SANDSTONE_SLAB("사암 한 블록", 43, 1),
	//	DOUBLE_WOODEN_SLAB("규화한 참나무 한 블록", 43, 2),
	//	DOUBLE_COBBLESTONE_SLAB("조약돌 한 블록", 43, 3),
	//	DOUBLE_BRICK_SLAB("벽돌 한 블록", 43, 4),
	//	DOUBLE_STONE_BRICK_SLAB("석재 벽돌 한 블록", 43, 5),
	//	DOUBLE_NETHER_BRICK_SLAB("네더 벽돌 한 블록", 43, 6),
	//	DOUBLE_QUARTZ_SLAB("석영 한 블록", 43, 7),
		SMOOTH_STONE("매끄러운 돌", 43, 8),
		SMOOTH_SANDSTONE("매끄러운 사암", 43, 9),
		SMOOTH_QUARTZ("매끄러운 석영", 43, 15),
		SMOOTH_RED_SANDSTONE("매끄러운 붉은 사암"),
	SMOOTH_STONE_SLAB("매끄러운 돌 반 블록", 44),
		SANDSTONE_SLAB("사암 반 블록", 44, 1),
		PETRIFIED_OAK_SLAB("규화한 참나무 반 블록", 44, 2),
		COBBLESTONE_SLAB("조약돌 반 블록", 44, 3),
		BRICK_SLAB("벽돌 한 블록", 44, 4),
		STONE_BRICK_SLAB("석재 벽돌 반 블록", 44, 5),
		NETHER_BRICK_SLAB("네더 벽돌 반 블록", 44, 6),
		QUARTZ_SLAB("석영 반 블록", 44, 7),
		STONE_SLAB("돌 반 블록"),
		GRANITE_SLAB("화강암 반 블록"),
		POLISHED_GRANITE_SLAB("윤나는 화강암 반 블록"),
		DIORITE_SLAB("섬록암 반 블록"),
		POLISHED_DIORITE_SLAB("윤나는 섬록암 반 블록"),
		ANDESITE_SLAB("안산암 반 블록"),
		POLISHED_ANDESITE_SLAB("윤나는 안산암 반 블록"),
		MOSSY_COBBLESTONE_SLAB("이끼 낀 조약돌 반 블록"),
		MOSSY_STONE_BRICK_SLAB("이끼 낀 석재 벽돌 반 블록"),
		CUT_SANDSTONE_SLAB("깍인 사암 반 블록"),
		CUT_RED_SANDSTONE_SLAB("깍인 붉은 사암 반 블록"),
		SMOOTH_SANDSTONE_SLAB("매끄러운 사암 반 블록"),
		SMOOTH_RED_SANDSTONE_SLAB("매끄러운 붉은 사암 반 블록"),
		SMOOTH_QUARTZ_SLAB("매끄러운 석영 반 블록"),
		PRISMARINE_SLAB("프리즈머린 반 블록"),
		PRISMARINE_BRICK_SLAB("프리즈머린 벽돌 반 블록"),
		DARK_PRISMARINE_SLAB("짙은 프리즈머린 반 블록"),
		RED_NETHER_BRICK_SLAB("붉은 네더 벽돌 반 블록"),
		END_STONE_BRICK_SLAB("엔드 석재 벽돌 반 블록"),
	BRICKS("벽돌", 45),
	TNT("TNT", 46),
	BOOKSHELF("책장", 47),
	MOSSY_COBBLESTONE("이끼 낀 조약돌", 48),
	OBSIDIAN("흑요석", 49),
	TORCH("횃불", 50),
	FIRE("불", 51),
	SPAWNER("생성기", 52),
	OAK_STAIRS("참나무 계단", 53),
		SPRUCE_STAIRS("가문비나무 계단"),
		BIRCH_STAIRS("자작나무 계단"),
		JUNGLE_STAIRS("정글나무 계단"),
		ACACIA_STAIRS("아카시아나무 계단"),
		DARK_OAK_STAIRS("짙은 참나무 계단"),
	CHEST("상자", 54),
	//REDSTONE_WIRE("레드스톤 가루", 55),
	DIAMOND_ORE("다이아몬드 원석", 56),
	DIAMOND_BLOCK("다이아몬드 블록", 57),
	CRAFTING_TABLE("제작대", 58),
	//CROPS("작물", 59),
	FARMLAND("경작지", 60),
	FURNACE("화로", 61),
	//BURNING_FURNACE("화로", 62),
	//SIGN_POST("표지판", 63),
	//WOODEN_DOOR("나무문", 64),
	LADDER("사다리", 65),
	RAIL("레일", 66),
	COBBLESTONE_STAIRS("조약돌 계단", 67),
	//WALL_SIGN("표지판", 68),
	LEVER("레버", 69),
	STONE_PRESSURE_PLATE("돌 압력판", 70),
	//IRON_DOOR_BLOCK("철문", 71),
	OAK_PRESSURE_PLATE("참나무 압력판", 72),
		SPRUCE_PRESSURE_PLATE("가문비나무 압력판"),
		BIRCH_PRESSURE_PLATE("자작나무 압력판"),
		JUNGLE_PRESSURE_PLATE("정글나무 압력판"),
		ACACIA_PRESSURE_PLATE("아카시아나무 압력판"),
		DARK_OAK_PRESSURE_PLATE("짙은 참나무 압력판"),
	REDSTONE_ORE("레드스톤 광석", 73),
	//GLOWING_REDSTONE_ORE("레드스톤 광석", 74),
	//REDSTONE_TORCH_OFF("레드스톤 횃불", 75),
	REDSTONE_TORCH("레드스톤 횃불", 76),
	STONE_BUTTON("돌 버튼", 77),
	SNOW("눈", 78),
	ICE("얼음", 79),
	SNOW_BLOCK("눈 블록", 80),
	CACTUS("선인장", 81),
	CLAY("점토", 82),
	//SUGAR_CANE_BLOCK("사탕수수", 83),
	JUKEBOX("주크박스", 84),
	OAK_FENCE("참나무 울타리", 85),
	PUMPKIN("호박"), /* +1.13 */
	CARVED_PUMPKIN("조각된 호박", 86),
	NETHERRACK("네더랙", 87),
	SOUL_SAND("영혼 모래", 88),
	GLOWSTONE("발광석", 89),
	//PORTAL("포탈", 90),
	JACK_O_LANTERN("잭 오 랜턴", 91),
	//CAKE_BLOCK("케이크", 92),
	//DIODE_BLOCK_OFF("레드스톤 중계기", 93),
	//DIODE_BLOCK_ON("레드스톤 중계기", 94),
	//	LOCKED_CHEST("잠긴 상자", 95),
	WHITE_STAINED_GLASS("하얀색 색유리", 95),
		ORANGE_STAINED_GLASS("주황색 색유리", 95, 1),
		MAGENTA_STAINED_GLASS("자홍색 색유리", 95, 2),
		LIGHT_BLUE_STAINED_GLASS("하늘색 색유리", 95, 3),
		YELLOW_STAINED_GLASS("노란색 색유리", 95, 4),
		LIME_STAINED_GLASS("연두색 색유리", 95, 5),
		PINK_STAINED_GLASS("분홍색 색유리", 95, 6),
		GRAY_STAINED_GLASS("회색 색유리", 95, 7),
		LIGHT_GRAY_STAINED_GLASS("회백색 색유리", 95, 8),
		CYAN_STAINED_GLASS("청록색 색유리", 95, 9),
		PURPLE_STAINED_GLASS("보라색 색유리", 95, 10),
		BLUE_STAINED_GLASS("파란색 색유리", 95, 11),
		BROWN_STAINED_GLASS("갈색 색유리", 95, 12),
		GREEN_STAINED_GLASS("초녹색 색유리", 95, 13),
		RED_STAINED_GLASS("빨간색 색유리", 95, 14),
		BLACK_STAINED_GLASS("검은색 색유리", 95, 15),
	OAK_TRAPDOOR("참나무 다락문", 96),
		SPRUCE_TRAPDOOR("가문비나무 다락문"),
		BIRCH_TRAPDOOR("자작나무 다락문"),
		JUNGLE_TRAPDOOR("정글나무 다락문"),
		ACACIA_TRAPDOOR("아카시아나무 다락문"),
		DARK_OAK_TRAPDOOR("짙은 참나무 다락문"),
	INFESTED_STONE("벌레 먹은 돌", 97),
		INFESTED_COBBLESTONE("벌레 먹은 조약돌", 97, 1),
		INFESTED_STONE_BRICKS("벌레 먹은 석재 벽돌", 97, 2),
		INFESTED_MOSSY_STONE_BRICKS("벌레 먹은 이끼 낀 석재 벽돌", 97, 3),
		INFESTED_CRACKED_STONE_BRICKS("벌레 먹은 금 간 석재 벽돌", 97, 4),
		INFESTED_CHISELED_STONE_BRICKS("벌레 먹은 조각된 석재 벽돌", 97, 5),
	STONE_BRICKS("석재 벽돌", 98),
		MOSSY_STONE_BRICKS("이끼 낀 석재 벽돌", 98, 1),
		CRACKED_STONE_BRICKS("금 간 석재 벽돌", 98, 2),
		CHISELED_STONE_BRICKS("조각된 석재 벽돌", 98, 3),
	BROWN_MUSHROOM_BLOCK("갈색 버섯 블럭", 99),
	RED_MUSHROOM_BLOCK("빨간색 버섯 블럭", 100),
	MUSHROOM_STEM("버섯 줄기"), /* +1.14 */
	IRON_BARS("철창", 101),
	GLASS_PANE("유리판", 102),
	MELON("수박", 103),
	//PUMPKIN_STEM("호박 줄기", 104),
	//MELON_STEM("수박 줄기", 105),
	VINE("덩굴", 106),
	OAK_FENCE_GATE("참나무 울타리 문", 107),
	BRICK_STAIRS("벽돌 계단", 108),
	STONE_BRICK_STAIRS("석재 벽돌 계단", 109),
	MYCELIUM("균사체", 110),
	LILY_PAD("수련잎", 111),
	NETHER_BRICKS("네더 벽돌", 112),
	NETHER_BRICK_FENCE("네더 벽돌 울타리", 113),
	NETHER_BRICK_STAIRS("네더 벽돌 계단", 114),
	//NETHER_WART_BLOCK("네더 와트", 115),
	ENCHANTING_TABLE("마법 부여대", 116),
	//BREWING_STAND("양조기", 117),
	//CAULDRON("가마솥", 118),
	//END_PORTAL("엔드 포탈", 119),
	END_PORTAL_FRAME("엔드 차원문 틀", 120),
	END_STONE("엔드 돌", 121),
	DRAGON_EGG("드래곤 알", 122),
	REDSTONE_LAMP("레드스톤 조명", 123),
	//REDSTONE_LAMP_ON("레드스톤 조명", 124),
	//DOUBLE_OAK_WOOD_SLAB("참나무 한 블록", 125),
	//	DOUBLE_SPRUCE_WOOD_SLAB("가문비나무 한 블록", 125, 1),
	//	DOUBLE_BIRCH_WOOD_SLAB("자작나무 한 블록", 125, 2),
	//	DOUBLE_JUNGLE_WOOD_SLAB("정글나무 한 블록", 125, 3),
	//	DOUBLE_ACACIA_WOOD_SLAB("아카시아나무 한 블록", 125, 4),
	//	DOUBLE_DARK_OAK_WOOD_SLAB("짙은 참나무 한 블록", 125, 5),
	OAK_SLAB("참나무 반 블록", 126),
		SPRUCE_SLAB("가문비나무 반 블록", 126, 1),
		BIRCH_SLAB("자작나무 반 블록", 126, 2),
		JUNGLE_SLAB("정글나무 반 블록", 126, 3),
		ACACIA_SLAB("아카시아나무 반 블록", 126, 4),
		DARK_OAK_SLAB("짙은 참나무 반 블록", 126, 5),
	//COCOA("코코아", 127),
	SANDSTONE_STAIRS("사암 계단", 128),
	EMERALD_ORE("에메랄드 원석", 129),
	ENDER_CHEST("엔더 상자", 130),
	//TRIPWIRE_HOOK("철사덫 갈고리", 131),
	//TRIPWIRE("철사덫", 132),
	EMERALD_BLOCK("에메랄드 블록", 133),
	SPRUCE_WOOD_STAIRS("가문비나무 계단", 134),
	BIRCH_WOOD_STAIRS("자작나무 계단", 135),
	JUNGLE_WOOD_STAIRS("정글나무 계단", 136),
	COMMAND_BLOCK("명령 블록", 137),
	BEACON("신호기", 138),
	COBBLESTONE_WALL("조약돌 담장", 139),
		MOSSY_COBBLESTONE_WALL("이끼 낀 조약돌 담장", 139, 1),
		BRICK_WALL("벽돌 담장"),
		GRANITE_WALL("화강암 담장"),
		DIORITE_WALL("섬록암 담장"),
		ANDESITE_WALL("안산암 담장"),
		SANDSTONE_WALL("사암 담장"),
		STONE_BRICK_WALL("석재 벽돌 담장"),
		RED_SANDSTONE_WALL("붉은 사암 담장"),
		MOSSY_STONE_BRICK_WALL("이끼 낀 석재 벽돌 담장"),
		PRISMARINE_WALL("프리즈머린 담장"),	
		NETHER_BRICK_WALL("네더 벽돌 담장"),
		RED_NETHER_BRICK_WALL("붉은 네더 벽돌 담장"),
		END_STONE_BRICK_WALL("엔드 석재 벽돌 담장"),
	//FLOWER_POT("화분", 140),
	//CARROT("당근", 141),
	//POTATO("감자", 142),		
	OAK_BUTTON("참나무 버튼", 143),
		SPRUCE_BUTTON("가문비나무 버튼"),
		BIRCH_BUTTON("자작나무 버튼"),
		JUNGLE_BUTTON("정글나무 버튼"),
		ACACIA_BUTTON("아카시아나무 버튼"),
		DARK_OAK_BUTTON("짙은 참나무 버튼"),
	//SKULL("해골", 144),
	ANVIL("모루", 145),
		CHIPPED_ANVIL("금 간 모루", 145, 4),
		DAMAGED_ANVIL("손상된 모루", 145, 8),
	TRAPPED_CHEST("덫 상자", 146),
	LIGHT_WEIGHTED_PRESSURE_PLATE("경형 무게 압력판", 147),
	HEAVY_WEIGHTED_PRESSURE_PLATE("중형 무게 압력판", 148),
	//REDSTONE_COMPARATOR_OFF("레드스톤 비교기", 149),
	//REDSTONE_COMPARATOR_ON("레드스톤 비교기", 150),
	DAYLIGHT_DETECTOR("햇빛 감지기", 151),
	REDSTONE_BLOCK("레드스톤 블록", 152),
	NETHER_QUARTZ_ORE("네더 석영 원석", 153),
	HOPPER("호퍼", 154),
	QUARTZ_BLOCK("석영 블록", 155),
		CHISELED_QUARTZ_BLOCK("조각된 석영 블록", 155, 1),
		QUARTZ_PILLAR("석영 기둥 블록", 155, 2),
	QUARTZ_STAIRS("석영 계단", 156),
	ACTIVATOR_RAIL("활성화 레일", 157),
	DROPPER("공급기", 158),
	WHITE_TERRACOTTA("하얀색 테라코타", 159),
		ORANGE_TERRACOTTA("주황색 테라코타", 159, 1),
		MAGENTA_TERRACOTTA("자홍색 테라코타", 159, 2),
		LIGHT_BLUE_TERRACOTTA("하늘색 테라코타", 159, 3),
		YELLOW_TERRACOTTA("노란색 테라코타", 159, 4),
		LIME_TERRACOTTA("연두색 테라코타", 159, 5),
		PINK_TERRACOTTA("분홍색 테라코타", 159, 6),
		GRAY_TERRACOTTA("회색 테라코타", 159, 7),
		LIGHT_GRAY_TERRACOTTA("회백색 테라코타", 159, 8),
		CYAN_TERRACOTTA("청록색 테라코타", 159, 9),
		PURPLE_TERRACOTTA("보라색 테라코타", 159, 10),
		BLUE_TERRACOTTA("파란색 테라코타", 159, 11),
		BROWN_TERRACOTTA("갈색 테라코타", 159, 12),
		GREEN_TERRACOTTA("초록색 테라코타", 159, 13),
		RED_TERRACOTTA("빨간색 테라코타", 159, 14),
		BLACK_TERRACOTTA("검은색 테라코타", 159, 15),
	WHITE_STAINED_GLASS_PANE("하얀색 색유리 판", 160),
		ORANGE_STAINED_GLASS_PANE("주황색 색유리 판", 160, 1),
		MAGENTA_STAINED_GLASS_PANE("자홍색 색유리 판", 160, 2),
		LIGHT_BLUE_STAINED_GLASS_PANE("하늘색 색유리 판", 160, 3),
		YELLOW_STAINED_GLASS_PANE("노란색 색유리 판", 160, 4),
		LIME_STAINED_GLASS_PANE("연두색 색유리 판", 160, 5),
		PINK_STAINED_GLASS_PANE("분홍색 색유리 판", 160, 6),
		GRAY_STAINED_GLASS_PANE("회색 색유리 판", 160, 7),
		LIGHT_GRAY_STAINED_GLASS_PANE("회백색 색유리 판", 159, 8),
		CYAN_STAINED_GLASS_PANE("청록색 색유리 판", 160, 9),
		PURPLE_STAINED_GLASS_PANE("보라색 색유리 판", 160, 10),
		BLUE_STAINED_GLASS_PANE("파란색 색유리 판", 160, 11),
		BROWN_STAINED_GLASS_PANE("갈색 색유리 판", 160, 12),
		GREEN_STAINED_GLASS_PANE("초록색 색유리 판", 160, 13),
		RED_STAINED_GLASS_PANE("빨간색 색유리 판", 160, 14),
		BLACK_STAINED_GLASS_PANE("검은색 색유리 판", 160, 15),
	ACACIA_LEAVES("아카시아나무 잎", 161),
		DARK_OAK_LEAVES("짙은 참나무 잎", 161, 1),
	ACACIA_LOG("아카시아나무 원목", 162),
		DARK_OAK_LOG("짙은 참나무 원목", 162, 1),
	ACACIA_WOOD_STAIRS("아카시아나무 계단", 163),
	DARK_OAK_WOOD_STAIRS("짙은 참나무 계단", 164),
	SLIME_BLOCK("슬라임 블록", 165),
	BARRIER("방벽", 166),
	IRON_TRAPDOOR("철 다락문", 167),
	PRISMARINE("프리즈머린", 168),
		PRISMARINE_BRICKS("프리즈머린 벽돌", 168, 1),
		DARK_PRISMARINE("짙은 프리즈머린", 168, 2),
	SEA_LANTERN("바다 랜턴", 169),
	HAY_BLOCK("건초 더미", 170),
	WHITE_CARPET("하얀색 양탄자", 171),
		ORANGE_CARPET("주황색 양탄자", 171, 1),
		MAGENTA_CARPET("자홍색 양탄자", 171, 2),
		LIGHT_BLUE_CARPET("하늘색 양탄자", 171, 3),
		YELLOW_CARPET("노란색 양탄자", 171, 4),
		LIME_CARPET("연두색 양탄자", 171, 5),
		PINK_CARPET("분홍색 양탄자", 171, 6),
		GRAY_CARPET("회색 양탄자", 171, 7),
		LIGHT_GRAY_CARPET("회백색 양탄자", 171, 8),
		CYAN_CARPET("청록색 양탄자", 171, 9),
		PURPLE_CARPET("보라색 양탄자", 171, 10),
		BLUE_CARPET("파란색 양탄자", 171, 11),
		BROWN_CARPET("갈색 양탄자", 171, 12),
		GREEN_CARPET("초록색 양탄자", 171, 13),
		RED_CARPET("빨간색 양탄자", 171, 14),
		BLACK_CARPET("검은색 양탄자", 171, 15),
	TERRACOTTA("테라코타", 172),
	COAL_BLOCK("석탄 블록", 173),
	PACKED_ICE("꽁꽁 언 얼음", 174),
	SUNFLOWER("해바라기", 175),
		LILAC("라일락", 175, 1),
		TALL_GRASS("키 큰 잔디", 175, 2),
		LARGE_FERN("큰 고사리", 175, 3),
		ROSE_BUSH("장미 덤불", 175, 4),
		PEONY("모란", 175, 5),
	//STANDING_BANNER("현수막", 176),
	//WALL_BANNER("현수막", 177),
	//DAYLIGHT_DETECTOR_INVERTED("햇빛 감지기", 178),
	RED_SANDSTONE("붉은 사암", 179),
		CHISELED_RED_SANDSTONE("조각된 붉은 사암", 179, 1),
		CUT_RED_SANDSTONE("깍인 붉은 사암", 179, 2),
	RED_SANDSTONE_STAIRS("붉은 사암 계단", 180),
	//DOUBLE_RED_SANDSTONE_SLAB("붉은 사암 한 블록", 181),
	RED_SANDSTONE_SLAB("붉은 사암 반 블록", 182),
	SPRUCE_FENCE_GATE("가문비나무 울타리 문", 183),
	BIRCH_FENCE_GATE("자작나무 울타리 문", 184),
	JUNGLE_FENCE_GATE("정글나무 울타리 문", 185),
	DARK_OAK_FENCE_GATE("짙은 참나무 울타리 문", 186),
	ACACIA_FENCE_GATE("아카시아나무 울타리 문", 187),
	SPRUCE_FENCE("가문비나무 울타리", 188),
	BIRCH_FENCE("자작나무 울타리", 189),
	JUNGLE_FENCE("정글나무 울타리", 190),
	DARK_OAK_FENCE("짙은 참나무 울타리", 191),
	ACACIA_FENCE("아카시아나무 울타리", 192),
	//SPRUCE_DOOR_BLOCK("가문비나무 문", 193),
	//BIRCH_DOOR_BLOCK("자작나무 문", 194),
	//JUNGLE_DOOR_BLOCK("정글나무 문", 195),
	//ACACIA_DOOR_BLOCK("아카시아나무 문", 196),
	//DARK_OAK_DOOR_BLOCK("짙은 참나무 문", 197),
	END_ROD("엔드 막대기", 198),
	CHORUS_PLANT("후렴초", 199),
	CHORUS_FLOWER("후렴화", 200),
	PURPUR_BLOCK("퍼퍼 블록", 201),
	PURPUR_PILLAR("퍼퍼 기둥", 202),
	PURPUR_STAIRS("퍼퍼 계단", 203),
	//PURPUR_DOUBLE_SLAB("퍼퍼 한 블록", 204),
	PURPUR_SLAB("퍼퍼 반 블록", 205),
	END_STONE_BRICKS("엔드 석재 벽돌", 206),
	//BEETROOT_BLOCK("사탕무", 207),
	GRASS_PATH("잔디 길", 208),
	//END_GATEWAY("엔드 관문", 209),
	REPEATING_COMMAND_BLOCK("반복형 명령 블록", 210),
	CHAIN_COMMAND_BLOCK("연쇄형 명령 블록", 211),
	FROSTED_ICE("살얼음", 212),
	MAGMA_BLOCK("마그마 블록", 213),
	NETHER_WART_BLOCK("네더 사마귀 블록", 214),
	RED_NETHER_BRICKS("붉은 네더 블록", 215),
	BONE_BLOCK("뼈 블록", 216),
	STRUCTURE_VOID("구조물 공허 블록", 217),
	OBSERVER("관측기", 218),
	SHULKER_BOX("셜커 상자"), /* +1.13 */
	WHITE_SHULKER_BOX("하얀색 셜커 상자", 219),
	ORANGE_SHULKER_BOX("주황색 셜커 상자", 220),
	MAGENTA_SHULKER_BOX("자홍색 셜커 상자", 221),
	LIGHT_BLUE_SHULKER_BOX("하늘색 셜커 상자", 222),
	YELLOW_SHULKER_BOX("노란색 셜커 상자", 223),
	LIME_SHULKER_BOX("연두색 셜커 상자", 224),
	PINK_SHULKER_BOX("분홍색 셜커 상자", 225),
	GRAY_SHULKER_BOX("회색 셜커 상자", 226),
	LIGHT_GRAY_SHULKER_BOX("회백색 셜커 상자", 227),
	CYAN_SHULKER_BOX("청록색 셜커 상자", 228),
	PURPLE_SHULKER_BOX("보라색 셜커 상자", 229),
	BLUE_SHULKER_BOX("파란색 셜커 상자", 230),
	BROWN_SHULKER_BOX("갈색 셜커 상자", 231),
	GREEN_SHULKER_BOX("초록색 셜커 상자", 232),
	RED_SHULKER_BOX("빨간색 셜커 상자", 233),
	BLACK_SHULKER_BOX("검은색 셜커 상자", 234),
	WHITE_GLAZED_TERRACOTTA("하얀색 유광 테라코타", 235),
	ORANGE_GLAZED_TERRACOTTA("주황색 유광 테라코타", 236),
	MAGENTA_GLAZED_TERRACOTTA("자홍색 유광 테라코타", 237),
	LIGHT_BLUE_GLAZED_TERRACOTTA("하늘색 유광 테라코타", 238),
	YELLOW_GLAZED_TERRACOTTA("노란색 유광 테라코타", 239),
	LIME_GLAZED_TERRACOTTA("연두색 유광 테라코타", 240),
	PINK_GLAZED_TERRACOTTA("분홍색 유광 테라코타", 241),
	GRAY_GLAZED_TERRACOTTA("회색 유광 테라코타", 242),
	LIGHT_GRAY_GLAZED_TERRACOTTA("회백색 유광 테라코타", 243),
	CYAN_GLAZED_TERRACOTTA("청록색 유광 테라코타", 244),
	PURPLE_GLAZED_TERRACOTTA("보라색 유광 테라코타", 245),
	BLUE_GLAZED_TERRACOTTA("파란색 유광 테라코타", 246),
	BROWN_GLAZED_TERRACOTTA("갈색 유광 테라코타", 247),
	GREEN_GLAZED_TERRACOTTA("초록색 유광 테라코타", 248),
	RED_GLAZED_TERRACOTTA("빨간색 유광 테라코타", 249),
	BLACK_GLAZED_TERRACOTTA("검은색 유광 테라코타", 250),
	WHITE_CONCRETE("하얀색 콘크리트", 251),
	ORANGE_CONCRETE("주황색  콘크리트", 251, 1),
	MAGENTA_CONCRETE("자홍색 콘크리트", 251, 2),
	LIGHT_BLUE_CONCRETE("하늘색 콘크리트", 251, 3),
	YELLOW_CONCRETE("노란색 콘크리트", 251, 4),
	LIME_CONCRETE("연두색 콘크리트", 251, 5),
	PINK_CONCRETE("분홍색 콘크리트", 251, 6),
	GRAY_CONCRETE("희색 콘크리트", 251, 7),
	LIGHT_GRAY_CONCRETE("회백색 콘크리트", 251, 8),
	CYAN_CONCRETE("청록색 콘크리트", 251, 9),
	PURPLE_CONCRETE("보라색 콘크리트", 251, 10),
	BLUE_CONCRETE("파란색 콘크리트", 251, 11),
	BROWN_CONCRETE("갈색 콘크리트", 251, 12),
	GREEN_CONCRETE("초록색 콘크리트", 251, 13),
	RED_CONCRETE("빨간색 콘크리트", 251, 14),
	BLACK_CONCRETE("검은색 콘크리트", 251, 15),
	WHITE_CONCRETE_POWDER("하얀색 콘크리트 가루", 252),
	ORANGE_CONCRETE_POWDER("주황색 콘크리트 가루", 252, 1),
	MAGENTA_CONCRETE_POWDER("자홍색 콘크리트 가루", 252, 2),
	LIGHT_BLUE_CONCRETE_POWDER("하늘색 콘크리트 가루", 252, 3),
	YELLOW_CONCRETE_POWDER("노란색 콘크리트 가루", 252, 4),
	LIME_CONCRETE_POWDER("연두색 콘크리트 가루", 252, 5),
	PINK_CONCRETE_POWDER("분홍색 콘크리트 가루", 252, 6),
	GRAY_CONCRETE_POWDER("회색 콘크리트 가루", 252, 7),
	LIGHT_GRAY_CONCRETE_POWDER("회백색 콘크리트 가루", 252, 8),
	CYAN_CONCRETE_POWDER("청록색 콘크리트 가루", 252, 9),
	PURPLE_CONCRETE_POWDER("보라색 콘크리트 가루", 252, 10),
	BLUE_CONCRETE_POWDER("파란색 콘크리트 가루", 252, 11),
	BROWN_CONCRETE_POWDER("갈색 콘크리트 가루", 252, 12),
	GREEN_CONCRETE_POWDER("초록색 콘크리트 가루", 252, 13),
	RED_CONCRETE_POWDER("빨간색 콘크리트 가루", 252, 14),
	BLACK_CONCRETE_POWDER("검은색 콘크리트 가루", 252, 15),
	STRUCTURE_BLOCK("구조물 블록", 255),
	
	/* MC 1.13 */
	BLUE_ICE("푸른얼음"),
	CONDUIT("전달체"),
	TUBE_CORAL("관 산호"),
	BRAIN_CORAL("뇌 산호"),
	BUBBLE_CORAL("거품 산호"),
	FIRE_CORAL("불 산호"),
	HORN_CORAL("사방 산호"),
	TUBE_CORAL_BLOCK("관 산호 블록"),
	BRAIN_CORAL_BLOCK("뇌 산호 블록"),
	BUBBLE_CORAL_BLOCK("거품 산호 블록"),
	FIRE_CORAL_BLOCK("불 산호 블록"),
	HORN_CORAL_BLOCK("사방 산호 블록"),
	TUBE_CORAL_FAN("부채형 관 산호"),
	BRAIN_CORAL_FAN("부채형 뇌 산호"),
	BUBBLE_CORAL_FAN("부채형 거품 산호"),
	FIRE_CORAL_FAN("부채형 불 산호"),
	HORN_CORAL_FAN("부채형 사방 산호"),
	DEAD_TUBE_CORAL("죽은 관 산호"),
	DEAD_BRAIN_CORAL("죽은 뇌 산호"),
	DEAD_BUBBLE_CORAL("죽은 거품 산호"),
	DEAD_FIRE_CORAL("죽은 불 산호"),
	DEAD_HORN_CORAL("죽은 사방 산호"),
	DEAD_TUBE_CORAL_BLOCK("죽은 관 산호 블록"),
	DEAD_BRAIN_CORAL_BLOCK("죽은 뇌 산호 블록"),
	DEAD_BUBBLE_CORAL_BLOCK("죽은 거품 산호 블록"),
	DEAD_FIRE_CORAL_BLOCK("죽은 불 산호 블록"),
	DEAD_HORN_CORAL_BLOCK("죽은 사방 산호 블록"),
	DEAD_TUBE_CORAL_FAN("죽은 부채형 관 산호"),
	DEAD_BRAIN_CORAL_FAN("죽은 부채형 뇌 산호"),
	DEAD_BUBBLE_CORAL_FAN("죽은 부채형 거품 산호"),
	DEAD_FIRE_CORAL_FAN("죽은 부채형 불 산호"),
	DEAD_HORN_CORAL_FAN("죽은 부채형 사방 산호"),
	KELP("켈프"),
	DRIED_KELP_BLOCK("말린 켈프 블록"),
	SEAGRASS("해초"),
	SEA_PICKLE("불우렁쉥이"),
	TURTLE_EGG("거북 알"),
	
	/* MC 1.14 */
	BAMBOO("대나무"),
	BARREL("통"),
	BELL("종"),
	BLAST_FURNACE("용광로"),
	CAMPFIRE("모닥불"),
	CARTOGRAPHY_TABLE("지도 제작대"),
	COMPOSTER("퇴비통"),
	FLETCHING_TABLE("화살 작업대"),
	CORNFLOWER("수레국화"),
	LILY_OF_THE_VALLEY("은방울꽃"),
	WITHER_ROSE("위더 장미"),
	GRINDSTONE("숫돌"),
	JIGSAW("직소블록"),
	LANTERN("랜턴"),
	LECTERN("독서대"),
	LOOM("베틀"),
	SCAFFOLDING("비계"),
	SMITHING_TABLE("대장장이 작업대"),
	SMOKER("훈연기"),
	STONECUTTER("석재 절단기"),
	STONE_STAIRS("돌 계단"),
	GRANITE_STAIRS("화강암 계단"),
	POLISHED_GRANITE_STAIRS("윤나는 화강암 계단"),
	DIORITE_STAIRS("섬록암 계단"),
	POLISHED_DIORITE_STAIRS("윤나는 섬록암 계단"),
	ANDESITE_STAIRS("안산암 계단"),
	POLISHED_ANDESITE_STAIRS("윤나는 안산암 계단"),
	MOSSY_COBBLESTONE_STAIRS("이끼 낀 조약돌 계단"),
	MOSSY_STONE_BRICK_STAIRS("이끼 낀 석재 벽돌 계단"),
	PRISMARINE_STAIRS("프리즈머린 계단"),
	PRISMARINE_BRICK_STAIRS("프리즈머린 벽돌 계단"),
	DARK_PRISMARINE_STAIRS("짙은 프리즈머린 계단"),
	SMOOTH_SANDSTONE_STAIRS("매끄러운 사암 계단"),
	SMOOTH_RED_SANDSTONE_STAIRS("매끄러운 붉은 사암 계단"),
	SMOOTH_QUARTZ_STAIRS("매끄러운 석영 계단"),
	RED_NETHER_BRICK_STAIRS("붉은 네더 벽돌 계단"),
	END_STONE_BRICK_STAIRS("엔드 석재 벽돌 계단"),
	
	/* MC 1.15 */	
	BEEHIVE("벌통"),
	BEE_NEST("벌집"),
	HONEY_BLOCK("꿀 블록"),
	HONEYCOMB_BLOCK("벌집 조각 블록"),
	
	/* MC 1.16*/
	CRIMSON_NYLIUM("진홍빛 네사체"),
	WARPED_NYLIUM("뒤틀린 네사체"),
	CRIMSON_PLANKS("진홍빛 판자"),
	WARPED_PLANKS("뒤틀린 판자"),
	NETHER_GOLD_ORE("네더 금광석"),
	CRIMSON_STEM("진홍빛 자루"),
	WARPED_STEM("뒤틀린 자루"),
	STRIPPED_CRIMSON_STEM("껍질 벗긴 진홍빛 자루"),
	STRIPPED_WARPED_STEM("껍질 벗긴 뒤틀린 자루"),
	STRIPPED_CRIMSON_HYPHAE("껍질 벗긴 진홍빛 균사"),
	STRIPPED_WARPED_HYPHAE("껍질 벗긴 뒤틀린 균사"),
	CRIMSON_HYPHAE("진홍빛 균사"),
	WARPED_HYPHAE("뒤틀린 균사"),
	CRIMSON_SLAB("진홍빛 반 블록"),
	WARPED_SLAB("뒤틀린 반 블록"),
	SOUL_SOIL("영혼 흙"),
	BASALT("현무암"),
	POLISHED_BASALT("윤나는 현무암"),
	CRACKED_NETHER_BRICKS("금 간 네더 벽돌"),
	CHISELED_NETHER_BRICKS("조각된 네더 벽돌"),
	CRIMSON_STAIRS("진홍빛 계단"),
	WARPED_STAIRS("뒤틀린 계단"),
	QUARTZ_BRICKS("석영 벽돌"),
	WARPED_WART_BLOCK("뒤틀린 사마귀 블록"),
	NETHERITE_BLOCK("네더라이트 블록"),
	ANCIENT_DEBRIS("고대 잔해"),
	CRYING_OBSIDIAN("우는 흑요석"),
	BLACKSTONE("흑암"),
	BLACKSTONE_SLAB("흑암 반 블록"),
	BLACKSTONE_STAIRS("흑암 계단"),
	GILDED_BLACKSTONE("황금이 박힌 흑암"),
	POLISHED_BLACKSTONE("윤나는 흑암"),
	POLISHED_BLACKSTONE_SLAB("윤나는 흑암 반 블록"),
	POLISHED_BLACKSTONE_STAIRS("윤나는 흑암 계단"),
	CHISELED_POLISHED_BLACKSTONE("조각된 윤나는 흑암"),
	POLISHED_BLACKSTONE_BRICKS("윤나는 흑암 벽돌"),
	POLISHED_BLACKSTONE_BRICK_SLAB("윤나는 흑암 벽돌 반 블록"),
	POLISHED_BLACKSTONE_BRICK_STAIRS("윤나는 흑암 벽돌 계단"),
	CRACKED_POLISHED_BLACKSTONE_BRICKS("금 간 윤나는 흑암 벽돌"),
	
	CRIMSON_FUNGUS("진홍빛 균"),
	WARPED_FUNGUS("뒤틀린 균"),
	CRIMSON_ROOTS("진홍빛 뿌리"),
	WARPED_ROOTS("뒤틀린 뿌리"),
	NETHER_SPROUTS("네더 싹"),
	WEEPING_VINES("늘어진 동굴"),
	TWISTING_VINES("휘어진 덩굴"),
	CRIMSON_FENCE("진홍빛 울타리"),
	WARPED_FENCE("뒤틀린 울타리"),
	SOUL_TORCH("영혼 횃불"),
	CHAIN("사슬"),
	BLACKSTONE_WALL("흑암 담장"),
	POLISHED_BLACKSTONE_WALL("윤나는 흑암 담장"),
	POLISHED_BLACKSTONE_BRICK_WALL("윤나는 흑암 벽돌 담장"),
	LODESTONE("자석석"),
	RESPAWN_ANCHOR("리스폰 정박기"),
	
	CRIMSON_PRESSURE_PLATE("진홍빛 압력판"),
	WARPED_PRESSURE_PLATE("뒤틀린 압력판"),
	POLISHED_BLACKSTONE_PRESSURE_PLATE("윤나는 흑암 압력판"),
	CRIMSON_TRAPDOOR("진홍빛 다락문"),
	WARPED_TRAPDOOR("뒤틀린 다락문"),
	CRIMSON_FENCE_GATE("진홍빛 울타리 문"),
	WARPED_FENCE_GATE("뒤틀린 울타리 문"),
	CRIMSON_BUTTON("진홍빛 버튼"),
	WARPED_BUTTON("뒤틀린 버튼"),
	POLISHED_BLACKSTONE_BUTTON("윤나는 흑암 버튼"),
	CRIMSON_DOOR("진홍빛 문"),
	WARPED_DOOR("뒤틀린 문"),
	TARGET("과녁"),
	
	

	
	
	
	
	
	
/*---  ITEM  ---*/
	IRON_SHOVEL("철 삽", 256),
	IRON_PICKAXE("철 곡괭이", 257),
	IRON_AXE("철 도끼", 258),
	FLINT_AND_STEEL("부싯돌과 부시", 259),
	APPLE("사과", 260),
	BOW("활", 261),
	ARROW("화살", 262),
	COAL("석탄", 263),
		CHARCOAL("숯", 263, 1),
	DIAMOND("다이아몬드", 264),
	IRON_INGOT("철괴", 265),
	GOLD_INGOT("금괴", 266),
	IRON_SWORD("철 검", 267),
	WOODEN_SWORD("나무 검", 268),
	WOODEN_SHOVEL("나무 삽", 269),
	WOODEN_PICKAXE("나무 곡괭이", 270),
	WOODEN_AXE("나무 도끼", 271),
	STONE_SWORD("돌 검", 272),
	STONE_SHOVEL("돌 삽", 273),
	STONE_PICKAXE("돌 곡괭이", 274),
	STONE_AXE("돌 도끼", 275),
	DIAMOND_SWORD("다이아몬드 검", 276),
	DIAMOND_SHOVEL("다이아몬드 삽", 277),
	DIAMOND_PICKAXE("다이아몬드 곡괭이", 278),
	DIAMOND_AXE("다이아몬드 도끼", 279),
	STICK("막대기", 280),
	BOWL("그릇", 281),
	MUSHROOM_STEW("버섯 스튜", 282),
	GOLDEN_SWORD("황금 검", 283),
	GOLDEN_SHOVEL("황금 삽", 284),
	GOLDEN_PICKAXE("황금 곡괭이", 285),
	GOLDEN_AXE("황금 도끼", 286),
	STRING("실", 287),
	FEATHER("깃털", 288),
	GUNPOWDER("화약", 289),
	WOODEN_HOE("나무 괭이", 290),
	STONE_HOE("돌 괭이", 291),
	IRON_HOE("철 괭이", 292),
	DIAMOND_HOE("다이아몬드 괭이", 293),
	GOLDEN_HOE("황금 괭이", 294),
	WHEAT_SEEDS("밀 씨앗", 295),
	WHEAT("밀", 296),
	BREAD("빵", 297),
	LEATHER_HELMET("가죽 모자", 298),
	LEATHER_CHESTPLATE("가죽 조끼", 299),
	LEATHER_LEGGINGS("가죽 바지", 300),
	LEATHER_BOOTS("가죽 장화", 301),
	CHAINMAIL_HELMET("사슬 투구", 302),
	CHAINMAIL_CHESTPLATE("사슬 흉갑", 303),
	CHAINMAIL_LEGGINGS("사슬 각반", 304),
	CHAINMAIL_BOOTS("사슬 부츠", 305),
	IRON_HELMET("철 투구", 306),
	IRON_CHESTPLATE("철 흉갑", 307),
	IRON_LEGGINGS("철 각반", 308),
	IRON_BOOTS("철 부츠", 309),
	DIAMOND_HELMET("다이아몬드 투구", 310),
	DIAMOND_CHESTPLATE("다이아몬드 흉갑", 311),
	DIAMOND_LEGGINGS("다이아몬드 각반", 312),
	DIAMOND_BOOTS("다이아몬드 부츠", 313),
	GOLDEN_HELMET("황금 투구", 314),
	GOLDEN_CHESTPLATE("황금 흉갑", 315),
	GOLDEN_LEGGINGS("황금 각반", 316),
	GOLDEN_BOOTS("황금 부츠", 317),
	FLINT("부싯돌", 318),
	PORKCHOP("익히지 않은 돼지고기", 319),
	COOKED_PORKCHOP("익힌 돼지고기", 320),
	PAINTING("그림", 321),
	GOLDEN_APPLE("황금 사과", 322),
		ENCHANTED_GOLDEN_APPLE("마법이 부여된 황금 사과", 322, 1),
	OAK_SIGN("참나무 표지판", 323),
		SPRUCE_SIGN("가문비나무 표지판"),
		BIRCH_SIGN("자작나무 표지판"),
		JUNGLE_SIGN("정글 나무 표지판"),
		ACACIA_SIGN("아카시아나무 표지판"),
		DARK_OAK_SIGN("짙은 참나무 표지판"),
	OAK_DOOR("참나무 문", 324),
	BUCKET("양동이", 325),
	WATER_BUCKET("물 양동이", 326),
	LAVA_BUCKET("용암 양동이", 327),
	MINECART("광산 수레", 328),
	SADDLE("안장", 329),
	IRON_DOOR("철문", 330),
	REDSTONE("레드스톤 가루", 331),
	SNOWBALL("눈덩이", 332),
	OAK_BOAT("참나무 보트", 333),
	LEATHER("가죽", 334),
	MILK_BUCKET("우유 양동이", 335),
	BRICK("벽돌", 336),
	CLAY_BALL("점토", 337),
	SUGAR_CANE("사탕수수", 338),
	PAPER("종이", 339),
	BOOK("책", 340),
	SLIME_BALL("슬라임볼", 341),
	CHEST_MINECART("상자가 실린 광산 수레", 342),
	FURNACE_MINECART("화로가 실린 광산 수레", 343),
	EGG("달걀", 344),
	COMPASS("나침반", 345),
	FISHING_ROD("낚싯대", 346),
	CLOCK("시계", 347),
	GLOWSTONE_DUST("발광석 가루", 348),
	COD("생대구", 349),
		SALMON("생연어", 349, 1),
		TROPICAL_FISH("열대어", 349, 2),
		PUFFERFISH("복어", 349, 3),
	COOKED_COD("익힌 대구", 350),
		COOKED_SALMON("익힌 연어", 350, 1),
	INK_SAC("먹물 주머니", 351),
		RED_DYE("빨간색 염료", 351, 1),
		GREEN_DYE("초록색 염료", 351, 2),
	  COCOA_BEANS("코코아 콩", 351, 3),
	  LAPIS_LAZULI("청금석", 351, 4),
		PURPLE_DYE("보라색 염료", 351, 5),
		CYAN_DYE("청록색 염료", 351, 6),
		LIGHT_GRAY_DYE("회백색 염료", 351, 7),
		GRAY_DYE("회색 염료", 351, 8),
		PINK_DYE("분홍색 염료", 351, 9),
		LIME_DYE("연두색 염료", 351, 10),
		YELLOW_DYE("노란색 염료", 351, 11),
		LIGHT_BLUE_DYE("하늘색 염료", 351, 12),
		MAGENTA_DYE("자홍색 염료", 351, 13),
		ORANGE_DYE("주황색 염료", 351, 14),
	  BONE_MEAL("뼛가루", 351, 15),
		BLUE_DYE("파란색 염료"),
		BROWN_DYE("갈색 염료"),
		BLACK_DYE("검은색 염료"),
		WHITE_DYE("하얀색 염료"),
	BONE("뼈다귀", 352),
	SUGAR("설탕", 353),
	CAKE("케이크", 354),
	WHITE_BED("하얀색 침대", 355),
		ORANGE_BED("주황색 침대"),
		MAGENTA_BED("자홍색 침대"),
		LIGHT_BLUE_BED("하늘색 침대"),
		YELLOW_BED("노란색 침대"),
		LIME_BED("연두색 침대"),
		PINK_BED("분홍색 침대"),
		GRAY_BED("회색 침대"),
		LIGHT_GRAY_BED("회백색 침대"),
		CYAN_BED("청록색 침대"),
		PURPLE_BED("보라색 침대"),
		BLUE_BED("파란색 침대"),
		BROWN_BED("갈색 침대"),
		GREEN_BED("초록색 침대"),
		RED_BED("빨간색 침대"),
		BLACK_BED("검은색 침대"),
	REPEATER("레드스톤 중계기", 356),
	COOKIE("쿠키", 357),
	FILLED_MAP("지도", 358),
	SHEARS("가위", 359),
	MELON_SLICE("수박 조각", 360),
	PUMPKIN_SEEDS("호박씨", 361),
	MELON_SEEDS("수박씨", 362),
	BEEF("익히지 않은 소고기", 363),
	COOKED_BEEF("스테이크", 364),
	CHICKEN("익히지 않은 닭고기", 365),
	COOKED_CHICKEN("익힌 닭고기", 366),
	ROTTEN_FLESH("썩은 살점", 367),
	ENDER_PEARL("엔더 진주", 368),
	BLAZE_ROD("블레이즈 막대기", 369),
	GHAST_TEAR("가스트 눈물", 370),
	GOLD_NUGGET("황금 조각", 371),
	NETHER_WART("네더 사마귀", 372),
	POTION("물약", 373),
	GLASS_BOTTLE("유리병", 374),
	SPIDER_EYE("거미 눈", 375),
	FERMENTED_SPIDER_EYE("발효된 거미 눈", 376),
	BLAZE_POWDER("블레이즈 가루", 377),
	MAGMA_CREAM("마그마 크림", 378),
	BREWING_STAND("양조기", 379),
	CAULDRON("가마솥", 380),
	ENDER_EYE("엔더의 눈", 381),
	GLISTERING_MELON_SLICE("반짝이는 수박 조각", 382),
	//MONSTER_EGG("스폰 알", 383),
		ELDER_GUARDIAN_SPAWN_EGG("엘더 가디언 생성 알", 383, 4),
		WITHER_SKELETON_SPAWN_EGG("위더 스켈레톤 생성 알", 383, 5),
		STRAY_SPAWN_EGG("스트레이 생성 알", 383, 6),
		HUSK_SPAWN_EGG("허스크 생성 알", 383, 23),
		ZOMBIE_VILLAGER_SPAWN_EGG("좀비 주민 생성 알", 383, 27),
		SKELETON_HORSE_SPAWN_EGG("스켈레톤 말 생성 알", 383, 28),
		ZOMBIE_HORSE_SPAWN_EGG("좀비 말 생성 알", 383, 29),
		DONKEY_SPAWN_EGG("당나귀 생성 알", 383, 31),
		MULE_SPAWN_EGG("노새 생성 알", 383, 32),
		EVOKER_SPAWN_EGG("소환사 생성 알", 383, 34),
		VEX_SPAWN_EGG("벡스 생성 알", 383, 35),
		VINDICATOR_SPAWN_EGG("변명자 생성 알", 383, 36),
		CREEPER_SPAWN_EGG("크리퍼 생성 알", 383, 50),
		SKELETON_SPAWN_EGG("스켈레톤 생성 알", 383, 51),
		SPIDER_SPAWN_EGG("거미 생성 알", 383, 52),
		ZOMBIE_SPAWN_EGG("좀비 생성 알", 383, 54),
		SLIME_SPAWN_EGG("슬라임 생성 알", 383, 55),
		GHAST_SPAWN_EGG("가스트 생성 알", 383, 56),
		ZOMBIE_PIGMAN_SPAWN_EGG("좀비 피그맨 생성 알", 383, 57),
		ENDERMAN_SPAWN_EGG("엔더맨 생성 알", 383, 58),
		CAVE_SPIDER_SPAWN_EGG("동굴 거미 생성 알", 383, 59),
		SILVERFISH_SPAWN_EGG("좀벌레 생성 알", 383, 60),
		BLAZE_SPAWN_EGG("블레이즈 생성 알", 383, 61),
		MAGMA_CUBE_SPAWN_EGG("마그마 큐브 생성 알", 383, 62),
		BAT_SPAWN_EGG("박쥐 생성 알", 383, 65),
		WITCH_SPAWN_EGG("마녀 생성 알", 383, 66),
		ENDERMITE_SPAWN_EGG("엔더마이트 생성 알", 383, 67),
		GUARDIAN_SPAWN_EGG("가디언 생성 알", 383, 68),
		SHULKER_SPAWN_EGG("셜커 생성 알", 383, 69),
		PIG_SPAWN_EGG("돼지 생성 알", 383, 90),
		SHEEP_SPAWN_EGG("양 생성 알", 383, 91),
		COW_SPAWN_EGG("소 생성 알", 383, 92),
		CHICKEN_SPAWN_EGG("닭 생성 알", 383, 93),
		SQUID_SPAWN_EGG("오징어 생성 알", 383, 94),
		WOLF_SPAWN_EGG("늑대 생성 알", 383, 95),
		MOOSHROOM_SPAWN_EGG("무시룸 생성 알", 383, 96),
		OCELOT_SPAWN_EGG("오실롯 생성 알", 383, 98),
		HORSE_SPAWN_EGG("말 생성 알", 383, 100),
		RABBIT_SPAWN_EGG("토끼 생성 알", 383, 101),
		POLAR_BEAR_SPAWN_EGG("북극곰 생성 알", 383, 102),
		LLAMA_SPAWN_EGG("라마 생성 알", 383, 103),
		PARROT_SPAWN_EGG("앵무새 생성 알", 383, 105),
		VILLAGER_SPAWN_EGG("주민 생성 알", 383, 120),
		DROWNED_SPAWN_EGG("드라운드 생성 알"),
		PHANTOM_SPAWN_EGG("팬텀 생성 알"),
		DOLPHIN_SPAWN_EGG("돌고래 생성 알"),
		TURTLE_SPAWN_EGG("거북 생성 알"),
		COD_SPAWN_EGG("대구 생성 알"),
		SALMON_SPAWN_EGG("연어 생성 알"),
		PUFFERFISH_SPAWN_EGG("복어 생성 알"),
		TROPICAL_FISH_SPAWN_EGG("열대어 생성 알"),
		CAT_SPAWN_EGG("고양이 생성 알"),
		FOX_SPAWN_EGG("여우 생성 알"),
		PANDA_SPAWN_EGG("판다 생성 알"),
		PILLAGER_SPAWN_EGG("약탈자 생성 알"),
		RAVAGER_SPAWN_EGG("파괴수 생성 알"),
		TRADER_LLAMA_SPAWN_EGG("상인 라마 생성 알"),
		WANDERING_TRADER_SPAWN_EGG("떠돌이 상인 생성 알"),
		BEE_SPAWN_EGG("꿀벌 생성 알"),
	EXPERIENCE_BOTTLE("경험치 병", 384),
	FIRE_CHARGE("화염구", 385),
	WRITABLE_BOOK("책과 깃펜", 386),
	WRITTEN_BOOK("글이 쓰인 책", 387),
	EMERALD("에메랄드", 388),
	ITEM_FRAME("아이템 액자", 389),
	FLOWER_POT("화분", 390),
	CARROT("당근", 391),
	POTATO("감자", 392),
	BAKED_POTATO("구운 감자", 393),
	POISONOUS_POTATO("독이 있는 감자", 394),
	MAP("빈 지도", 395),
	GOLDEN_CARROT("황금 당근", 396),
	SKELETON_SKULL("스켈레톤 해골", 397),
		WITHER_SKELETON_SKULL("위더 스켈레톤 해골", 397, 1),
		ZOMBIE_HEAD("좀비 머리", 397, 2),
		PLAYER_HEAD("플레이어 머리", 397, 3),
		CREEPER_HEAD("크리퍼 머리", 397, 4),
		DRAGON_HEAD("드래곤 머리", 397, 5),
	CARROT_ON_A_STICK("당근 낚싯대", 398),
	NETHER_STAR("네더의 별", 399),
	PUMPKIN_PIE("호박 파이", 400),
	FIREWORK_ROCKET("폭죽 로켓", 401),
	FIREWORK_STAR("폭죽 탄약", 402),
	ENCHANTED_BOOK("마법이 부여된 책", 403),
	COMPARATOR("레드스톤 비교기", 404),
	NETHER_BRICK("네더 벽돌", 405),
	QUARTZ("네더 석영", 406),
	TNT_MINECART("TNT가 실린 광산 수레", 407),
	HOPPER_MINECART("호퍼가 실린 광산 수레", 408),
	PRISMARINE_SHARD("프리즈머린 조각", 409),
	PRISMARINE_CRYSTALS("프리즈머린 수정", 410),
	RABBIT("익히지 않은 토끼고기", 411),
	COOKED_RABBIT("익힌 토끼고기", 412),
	RABBIT_STEW("토끼 스튜", 413),
	RABBIT_FOOT("토끼발", 414),
	RABBIT_HIDE("토끼 가죽", 415),
	ARMOR_STAND("갑옷 거치대", 416),
	IRON_HORSE_ARMOR("철 말 갑옷", 417),
	GOLDEN_HORSE_ARMOR("황금 말 갑옷", 418),
	DIAMOND_HORSE_ARMOR("다이아몬드 말 갑옷", 419),
	LEATHER_HORSE_ARMOR("가죽 말 갑옷"),
	LEAD("끈", 420),
	NAME_TAG("이름표", 421),
	COMMAND_BLOCK_MINECART("명령 블럭이 실린 광산 수레", 422),
	MUTTON("익히지 않은 양고기", 423),
	COOKED_MUTTON("익힌 양고기", 424),
	WHITE_BANNER("하얀색 현수막", 425),
		ORANGE_BANNER("주황색 현수막"),
		MAGENTA_BANNER("자홍색 현수막"),
		LIGHT_BLUE_BANNER("하늘색 현수막"),
		YELLOW_BANNER("노란색 현수막"),
		LIME_BANNER("연두색 현수막"),
		PINK_BANNER("분홍색 현수막"),
		GRAY_BANNER("회색 현수막"),
		LIGHT_GRAY_BANNER("회백색 현수막"),
		CYAN_BANNER("청록색 현수막"),
		PURPLE_BANNER("보라색 현수막"),
		BLUE_BANNER("파란색 현수막"),
		BROWN_BANNER("갈색 현수막"),
		GREEN_BANNER("초록색 현수막"),
		RED_BANNER("빨간색 현수막"),
		BLACK_BANNER("검은색 현수막"),
	END_CRYSTAL("엔드 수정", 426),
	SPRUCE_DOOR("가문비나무 문", 427),
	BIRCH_DOOR("자작나무 문", 428),
	JUNGLE_DOOR("정글나무 문", 429),
	ACACIA_DOOR("아카시아나무 문", 430),
	DARK_OAK_DOOR("짙은 참나무 문", 431),
	CHORUS_FRUIT("후렴과", 432),
	POPPED_CHORUS_FRUIT("튀긴 후렴과", 433),
	BEETROOT("사탕무", 434),
	BEETROOT_SEEDS("사탕무 씨앗", 435),
	BEETROOT_SOUP("사탕무 수프", 436),
	DRAGON_BREATH("드래곤의 숨결", 437),
	SPLASH_POTION("투척용 물약", 438),
	SPECTRAL_ARROW("분광 화살", 439),
	TIPPED_ARROW("물약이 묻은 화살", 440),
	LINGERING_POTION("잔류형 물약", 441),
	SHIELD("방패", 442),
	ELYTRA("겉날개", 443),
	SPRUCE_BOAT("가문비나무 보트", 444),
	BIRCH_BOAT("자작나무 보트", 445),
	JUNGLE_BOAT("정글나무 보트", 446),
	ACACIA_BOAT("아카시아나무 보트", 447),
	DARK_OAK_BOAT("짙은 참나무 보트", 448),
	TOTEM_OF_UNDYING("불사의 토템", 449),
	SHULKER_SHELL("셜커 껍데기", 450),
	IRON_NUGGET("철 조각", 452),
	KNOWLEDGE_BOOK("지식의 책", 453),
	
	/*  MC 1.13  */
	DEBUG_STICK("디버그 막대기"),
	DRIED_KELP("말린 켈프"),
	COD_BUCKET("대구가 담긴 양동이"),
	SALMON_BUCKET("연어가 담긴 양동이"),
	TROPICAL_FISH_BUCKET("열대어가 담긴 양동이"),
	PUFFERFISH_BUCKET("복어가 담긴 양동이"),
	HEART_OF_THE_SEA("바다의 심장"),
	NAUTILUS_SHELL("앵무조개 껍데기"),
	PHANTOM_MEMBRANE("팬텀 막"),
	SCUTE("인갑"),
	TURTLE_HELMET("거북 등딱지"),
	TRIDENT("삼지창"),
	
	/*  MC 1.14  */
	FLOWER_BANNER_PATTERN("현수막 무늬"),
	CREEPER_BANNER_PATTERN("현수막 무늬"),
	SKULL_BANNER_PATTERN("현수막 무늬"),
	MOJANG_BANNER_PATTERN("현수막 무늬"),
	GLOBE_BANNER_PATTERN("현수막 무늬"),
	CROSSBOW("쇠뇌"),
	SUSPICIOUS_STEW("수상한 스튜"),
	SWEET_BERRIES("달콤한 열매"),
	
	/*  MC 1.15  */
	HONEY_BOTTLE("꿀이 든 병"),
	HONEYCOMB("벌집조각"),
	
	/*  MC 1.16  */
	WARPED_FUNGUS_ON_A_STICK("뒤틀린 균 낚싯대"),
	
	NETHERITE_INGOT("네더라이트 주괴"),
	NETHERITE_SCRAP("네더라이트 파편"),
	
	HOGLIN_SPAWN_EGG("호글린 생성 알"),
	PIGLIN_SPAWN_EGG("피글린 생성 알"),
	PIGLIN_BRUTE_SPAWN_EGG("피글린 야수 생성 알"),
	STRIDER_SPAWN_EGG("스트라이더 생성 알"),
	ZOGLIN_SPAWN_EGG("조글린 생성 알"),
	ZOMBIFIED_PIGLIN_SPAWN_EGG("좀비화 피글린 생성 알"),
	
	PIGLIN_BANNER_PATTERN("현수막 무늬"),
	
	NETHERITE_SHOVEL("네더라이트 삽"),
	NETHERITE_PICKAXE("네더라이트 곡괭이"),
	NETHERITE_AXE("네더라이트 도끼"),
	NETHERITE_HOE("네더라이트 괭이"),
	NETHERITE_SWORD("네더라이트 검"),
	NETHERITE_HELMET("네더라이트 투구"),
	NETHERITE_CHESTPLATE("네더라이트 흉갑"),
	NETHERITE_LEGGINGS("네더라이트 각반"),
	NETHERITE_BOOTS("네더라이트 부츠"),
	
	
	/*  DISC  */
	MUSIC_DISC_13("음반 §8[C418 - 13]§r", 2256),
	MUSIC_DISC_CAT("음반 §8[C418 - cat]§r", 2257),
	MUSIC_DISC_BLOCKS("음반 §8[C418 - blocks]§r", 2258),
	MUSIC_DISC_CHIRP("음반 §8[C418 - chirp]§r", 2259),
	MUSIC_DISC_FAR("음반 §8[C418 - far]§r", 2260),
	MUSIC_DISC_MALL("음반 §8[C418 - mall]§r", 2261),
	MUSIC_DISC_MELLOHI("음반 §8[C418 - mellohi]§r", 2262),
	MUSIC_DISC_STAL("음반 §8[C418 - stal]§r", 2263),
	MUSIC_DISC_STRAD("음반 §8[C418 - strad]§r", 2264),
	MUSIC_DISC_WARD("음반 §8[C418 - ward]§r", 2265),
	MUSIC_DISC_11("음반 §8[C418 - 11]§r", 2266),
	MUSIC_DISC_WAIT("음반 §8[C418 - wait]§r",  2267),
	
	MUSIC_DISC_PIGSTEP("음반 §8[Lena Raine - Pigstep]§r")
	;
	
	
	private String localizedName;
	private int id;
	private int data;
	private static final Map<String, Name> by_name = Maps.newHashMap();
	
	Name() {}
	
	Name(String name)
	{
		this.localizedName = name;
	}
	
	Name(String name, int id)
	{
		this.localizedName = name;
		this.id = id;
	}
	
	Name(String name, int id, int data)
	{
		this.localizedName = name;
		this.id = id;
		this.data = data;
	}
	
	public String getName()
	{
		return this.localizedName;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	static
	{
		for (Name name : values())
			by_name.put(name.name(), name);
	}
	
	public static Map<String, Name> getMap()
	{
		return by_name;
	}
	
	public static boolean isMatch(String name)
	{
		for (Name n : Name.values()) {
			if (n.name().equals(name))
				return true;
		}
		return false;
	}
	
	public static String getMatchName(String name)
	{
		for (Name n : Name.values())
		{
			if (n.name().equals(name))
				return n.getName();
		}
		return null;
	}

}