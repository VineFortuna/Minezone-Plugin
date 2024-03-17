package anthony.SuperCraftBrawl.Game.map;

import org.bukkit.util.Vector;

import anthony.SuperCraftBrawl.Game.GameType;

public enum DuosMaps {

	NightDragon("NightDragon",
			new MapInstance("nightdragon")
					.setSpawnPos(new Vector(206.442, 146, 372.380), new Vector(217.503, 150, 376.405),
							new Vector(230.433, 147, 366.369), new Vector(230.479, 146, 389.485),
							new Vector(214.470, 149, 409.434), new Vector(213.426, 143, 392.416))
					.setLobbyLoc(new Vector(162.522, 151, 369.520)).setSpecLoc(new Vector(211.499, 152.19487, 389.566))
					.setBounds(new Vector(216.500, 160, 382.500), 35, 45).setSignLoc(new Vector(203.500, 107, 673.700))
					.setMapType(MapType.SCB)),

	Village("Village",
			new MapInstance("village")
					.setSpawnPos(new Vector(-1186.492, 141, 1056.504), new Vector(-1186.505, 134, 1055.516),
							new Vector(-1174.615, 139, 1036.456), new Vector(-1199.511, 132, 985.438),
							new Vector(-1208.541, 134, 1020.386), new Vector(-1178.029, 137, 1016.004))
					.setLobbyLoc(new Vector(-1259.480, 130, 1008.520)).setSpecLoc(new Vector(-1182.500, 147, 1016.500))
					.setBounds(new Vector(-1182.500, 147, 1016.500), 42, 70)
					.setSignLoc(new Vector(195.544, 106, 673.700)).setMapType(MapType.COMMUNITY)),

	FloorIsLava("FloorIsLava",
			new MapInstance("floorislava")
					.setSpawnPos(new Vector(-1217.498, 138, 968.410), new Vector(-1197.213, 131, 973.378),
							new Vector(-1205.511, 137, 988.480), new Vector(-1214.476, 139, 1026.483),
							new Vector(-1225.680, 138, 1048.468), new Vector(-1228.616, 133, 1048.462))
					.setLobbyLoc(new Vector(-1274.005, 132, 1006.986)).setSpecLoc(new Vector(-1218.500, 141, 1007.500))
					.setBounds(new Vector(-1218.500, 141, 1007.500), 40, 80).setMapType(MapType.COMMUNITY)),

	NorthernSeas("NorthernSeas", new MapInstance("northernseas")
			.setSpawnPos(new Vector(-1268.869, 165, 998.872), new Vector(-1273.602, 143, 984.472),
					new Vector(-1257.214, 117, 959.390), new Vector(-1241.536, 119, 941.453),
					new Vector(-1241.404, 158, 966.367), new Vector(-1222.527, 116, 962.654))
			.setLobbyLoc(new Vector(-1239.519, 125, 890.484)).setSpecLoc(new Vector(-1241.538, 162, 969.491))
			.setBounds(new Vector(-1241.500, 165, 979.500), 60, 60).setSignLoc(new Vector(203.500, 108, 673.700))),

	CandyLand("CandyLand",
			new MapInstance("candylandclassic")
					.setSpawnPos(new Vector(-1260.987, 133, 1001.699), new Vector(-1246.512, 142, 1011.427),
							new Vector(-1244.523, 142, 1018.460), new Vector(-1238.533, 169, 1015.462),
							new Vector(-1266.582, 144, 1023.429), new Vector(-1279.072, 145, 1007.997))
					.setLobbyLoc(new Vector(-1259.504, 136, 960.513)).setSpecLoc(new Vector(-1264.500, 157, 1011.500))
					.setBounds(new Vector(-1265.532, 160, 1010.443), 50, 33)
					.setSignLoc(new Vector(205.536, 107, 673.700)).setMapType(MapType.SCB)),

	HauntedMansion("HauntedMansion",
			new MapInstance("hauntedmansion")
					.setSpawnPos(new Vector(-1260.502, 133, 953.975), new Vector(-1250.084, 137, 946.500),
							new Vector(-1207.495, 132, 966.517), new Vector(-1210.034, 132, 928.918),
							new Vector(-1240.008, 137, 953.951), new Vector(-1200.022, 137, 968.914))
					.setLobbyLoc(new Vector(-1143.578, 150, 961.426)).setSpecLoc(new Vector(-1207.500, 138, 959.500))
					.setBounds(new Vector(-1207.500, 138, 959.500), 100, 100)
					.setSignLoc(new Vector(-48.507, 127, -28.700)).setMapType(MapType.COMMUNITY)),

	Burrows("Burrows",
			new MapInstance("burrows")
					.setSpawnPos(new Vector(-1284.530, 131, 1027.466), new Vector(-1283.548, 123, 1019.481),
							new Vector(-1260.378, 128, 1041.478), new Vector(-1270.486, 123, 1045.557),
							new Vector(-1276.509, 114, 1036.509), new Vector(-1272.527, 130, 1017.414))
					.setLobbyLoc(new Vector(-1268.452, 141, 1083.502)).setSpecLoc(new Vector(-1270.500, 143, 1036.500))
					.setSignLoc(new Vector(193.487, 108, 673.700))
					.setBounds(new Vector(-1270.500, 143, 1036.500), 35, 32).setMapType(MapType.COMMUNITY)),

	CandyOverdose("CandyOverdose",
			new MapInstance("candyoverdose")
					.setSpawnPos(new Vector(-1281.535, 132, 1067.508), new Vector(-1278.571, 133, 1089.935),
							new Vector(-1300.621, 127, 1104.452), new Vector(-1320.966, 133, 1086.427),
							new Vector(-1306.504, 131, 1066.437), new Vector(-1306.449, 138, 1066.488))
					.setLobbyLoc(new Vector(-1238.522, 158, 1086.494)).setSpecLoc(new Vector(-1296.500, 149, 1081.500))
					.setSignLoc(new Vector(182.555, 108, 673.700))
					.setBounds(new Vector(-1296.500, 149, 1081.500), 42, 40).setMapType(MapType.FRENZY)),

	CliffSide("CliffSide",
			new MapInstance("cliffside")
					.setSpawnPos(new Vector(-1152.580, 153, 967.422), new Vector(-1119.486, 150, 960.466),
							new Vector(-1125.552, 116, 982.502), new Vector(-1141.509, 117, 996.459),
							new Vector(-1134.518, 136, 950.448), new Vector(-1145.985, 152, 986.381))
					.setLobbyLoc(new Vector(-1138.523, 160, 1031.516)).setSpecLoc(new Vector(-1137.465, 153, 976.451))
					.setBounds(new Vector(-1137.465, 153, 976.451), 200, 200).setMapType(MapType.COMMUNITY)
					.setSignLoc(new Vector(194.555, 107, 673.700))),

	/*
	 * EggHunt("EggHunt", new MapInstance("egghunt") .setSpawnPos(new
	 * Vector(-1224.297, 153, 972.793), new Vector(-1239.013, 161, 991.791), new
	 * Vector(-1274.368, 147, 992.237), new Vector(-1276.799, 167, 962.813), new
	 * Vector(-1215.393, 142, 945.668), new Vector(-1265.496, 142, 926.329))
	 * .setLobbyLoc(new Vector(-1242.535, 151, 877.519)).setSpecLoc(new
	 * Vector(-1248.500, 168, 963.500)) .setBounds(new Vector(-1239.549, 162,
	 * 960.644), 67, 65)),
	 */

	JungleRiver("JungleRiver", new MapInstance("jungleriver")
			.setSpawnPos(new Vector(-1286.582, 99, 963.440), new Vector(-1289.416, 111, 991.638),
					new Vector(-1255.538, 105, 998.475), new Vector(-1226.471, 121, 993.462),
					new Vector(-1229.484, 113, 957.462), new Vector(-1256.505, 134, 944.422))
			.setLobbyLoc(new Vector(-1328.460, 122, 972.520)).setSpecLoc(new Vector(-1241.064, 139.40382, 977.987))
			.setBounds(new Vector(-1249, 142, 976.499), 60, 65).setSignLoc(new Vector(173.550, 107, 673.700))
			.setMapType(MapType.BODIL40)),

	Stronghold("Stronghold",
			new MapInstance("stronghold")
					.setSpawnPos(new Vector(112.468, 152, -588.591), new Vector(99.516, 145, -586.557),
							new Vector(111.502, 150, -557.542), new Vector(96.431, 148, -551.543),
							new Vector(92.484, 151, -523.467), new Vector(81.435, 148, -539.514))
					.setLobbyLoc(new Vector(106.496, 152, -620.492)).setSpecLoc(new Vector(98.559, 155.27324, -561.960))
					.setBounds(new Vector(99.500, 163, -553.500), 35, 50).setSignLoc(new Vector(209.700, 107, 667.472))
					.setMapType(MapType.SETHBLING)),

	Icefall("Icefall",
			new MapInstance("iceland")
					.setSpawnPos(new Vector(-617.635, 106, -10.515), new Vector(-599.636, 106, 4.459),
							new Vector(-554.533, 111, 25.511), new Vector(-578.518, 121, -38.583),
							new Vector(-585.487, 120, -21.634), new Vector(-559.512, 120, -31.692))
					.setLobbyLoc(new Vector(-579.478, 115, 63.434)).setSpecLoc(new Vector(-572.825, 127.77250, -10.992))
					.setBounds(new Vector(-585.519, 129, -10.543), 60, 55).setSignLoc(new Vector(41.554, 117, 3.700))
					.setMapType(MapType.SCB)),

	Marooned("Marooned",
			new MapInstance("marooned")
					.setSpawnPos(new Vector(41, 98, 2), new Vector(59, 103, 41), new Vector(78, 108, 18),
							new Vector(103, 98, 19), new Vector(93, 98, -7), new Vector(61, 106, -14))
					.setSpecLoc(new Vector(46.857, 108.11874, 7.306)).setLobbyLoc(new Vector(61.508, 115, -77.462))
					.setBounds(new Vector(70.500, 116, 7.500), 60, 60).setSignLoc(new Vector(-48.507, 128, -28.700))
					.setMapType(MapType.COMMUNITY)),

	Orbital("Orbital", new MapInstance("orbital")
			.setSpawnPos(new Vector(50.3, 96, -18.5), new Vector(73.4, 100.5, -13.5), new Vector(73.4, 97, 11.4),
					new Vector(65.4, 114, 27.3), new Vector(51.5, 102, 27.4), new Vector(44.5, 97, 12.5))
			.setLobbyLoc(new Vector(1.490, 100, 6.498)).setSpecLoc(new Vector(55.424, 113, 6.820))
			.setBounds(new Vector(55.484, 113, 6.503), 35, 50).setGameType(GameType.DUEL)
			.setSignLoc(new Vector(168.300, 106, 668.537)).setMapType(MapType.DUEL)),
	TheEnd("TheEnd",
			new MapInstance("theend")
					.setSpawnPos(new Vector(398.589, 162, 219.495), new Vector(365.481, 148, 234.525),
							new Vector(368.491, 147, 197.447), new Vector(348.422, 148, 215.429),
							new Vector(352.418, 163, 223.484), new Vector(391.487, 148, 209.432))
					.setLobbyLoc(new Vector(374.503, 151, 162.511)).setSpecLoc(new Vector(364.373, 161.05132, 215.139))
					.setBounds(new Vector(373.442, 159, 218.488), 50, 40).setSignLoc(new Vector(209.700, 107, 668.489))
					.setMapType(MapType.SETHBLING)),

	Tropical("Tropical",
			new MapInstance("tropical")
					.setSpawnPos(new Vector(408.509, 120, 122.405), new Vector(436.509, 122.25000, 156.559),
							new Vector(422.545, 104, 173.471), new Vector(380.358, 103, 155.491),
							new Vector(404.051, 120, 157.006), new Vector(424.504, 103, 140.493))
					.setLobbyLoc(new Vector(333.583, 107, 154.515)).setSpecLoc(new Vector(403.845, 124.41554, 157.094))
					.setBounds(new Vector(404.461, 123, 152.472), 50, 50).setSignLoc(new Vector(174.478, 106, 673.700))
					.setMapType(MapType.BODIL40)),

	Waterfall("Waterfall",
			new MapInstance("waterfall")
					.setSpawnPos(new Vector(301.409, 134, 155.477), new Vector(297.236, 127, 194.664),
							new Vector(343.504, 132, 163.495), new Vector(338.481, 134, 182.448),
							new Vector(302.482, 117, 152.405), new Vector(345.456, 120, 151.498))
					.setLobbyLoc(new Vector(240.525, 142, 171.456)).setSpecLoc(new Vector(317.500, 141, 175.500))
					.setBounds(new Vector(317.500, 141, 175.500), 47, 40).setSignLoc(new Vector(195.544, 108, 673.700))
					.setMapType(MapType.COMMUNITY)),

	Gateway("Gateway",
			new MapInstance("gateway")
					.setSpawnPos(new Vector(372.481, 102, 168.417), new Vector(392.537, 102, 188.440),
							new Vector(372.445, 102, 208.485), new Vector(353.420, 102, 188.476),
							new Vector(345.435, 104, 211.468), new Vector(345.507, 106, 162.408))
					.setLobbyLoc(new Vector(369.458, 115, 258.441)).setBounds(new Vector(372.483, 128, 188.497), 50, 50)
					.setGameType(GameType.DUEL).setSignLoc(new Vector(168.300, 106, 669.556)).setMapType(MapType.DUEL)
					.setSignLoc(new Vector(168.300, 106, 669.542)).setSpecLoc(new Vector(372.435, 100, 188.626))),

	Pokemob("Pokemob",
			new MapInstance("pokemob")
					.setSpawnPos(new Vector(382.598, 109, 255.503), new Vector(372.513, 105, 237.486),
							new Vector(352.448, 110, 224.399), new Vector(321.346, 107, 254.454),
							new Vector(337.445, 105, 233.402), new Vector(373.408, 108, 275.570))
					.setLobbyLoc(new Vector(286.560, 113, 254.505)).setBounds(new Vector(353.450, 125, 254.414), 50, 50)
					.setMapType(MapType.SCB)),

	Revenge("Revenge",
			new MapInstance("atronach")
					.setSpawnPos(new Vector(47.3, 99, 1.4), new Vector(83.4, 99, -31.5), new Vector(120.4, 99, 3.4),
							new Vector(83.5, 99, 39.4), new Vector(87.4, 136, 5.4), new Vector(82.5, 103, 8.4))
					.setLobbyLoc(new Vector(-8.435, 116, -2.488)).setSpecLoc(new Vector(87.665, 146.01941, 6.043))
					.setBounds(new Vector(83.500, 150, 3.500), 60, 60).setGameType(GameType.FRENZY)
					.setSignLoc(new Vector(183.513, 106, 673.700)).setMapType(MapType.FRENZY)),

	Atronach("Atronach",
			new MapInstance("atronach2")
					.setSpawnPos(new Vector(64.473, 107, -94.528), new Vector(87.499, 107, -70.563),
							new Vector(70.451, 107, -24.514), new Vector(41.474, 107, -22.505),
							new Vector(19.435, 107, -42.521), new Vector(19.404, 107, -67.537))
					.setLobbyLoc(new Vector(57.475, 109.31250, -130.494)).setSpecLoc(new Vector(59.525, 157, -64.436))
					.setBounds(new Vector(55.500, 174, -57.500), 58, 58).setGameType(GameType.FRENZY)
					.setSignLoc(new Vector(184.568, 106, 673.700)).setMapType(MapType.FRENZY)),

	Elven("Elven", new MapInstance("elven")
			.setSpawnPos(new Vector(8.498, 150, -50.562), new Vector(23.065, 150, -26.283),
					new Vector(45.160, 150, -6.369), new Vector(48.377, 150, 16.092), new Vector(29.859, 150, 29.376),
					new Vector(8.354, 150, 71.438), new Vector(-8.759, 150, 50.796), new Vector(-37.138, 150, 74.446),
					new Vector(-63.676, 150, 48.281), new Vector(-86.450, 150, 19.555),
					new Vector(-87.639, 150, -1.816), new Vector(-48.328, 150, -38.650),
					new Vector(-19.484, 173, 15.608), new Vector(-16.459, 173, 0.535), new Vector(-21.527, 233, -4.469),
					new Vector(-40.583, 218, -38.567))
			.setLobbyLoc(new Vector(-20.511, 165, -123.424)).setSpecLoc(new Vector(-22.500, 254, 6.500))
			.setBounds(new Vector(-22.500, 254, 1.500), 100, 100).setGameType(GameType.FRENZY)
			.setSignLoc(new Vector(182.542, 107, 673.700)).setMapType(MapType.FRENZY)),

	Limbo("Limbo",
			new MapInstance("limbo")
					.setSpawnPos(new Vector(-7.567, 152, -171.522), new Vector(22.390, 153, -191.667),
							new Vector(62.603, 165, -176.552), new Vector(65.449, 152, -177.584),
							new Vector(40.460, 187, -155.496), new Vector(13.575, 151, -129.550))
					.setLobbyLoc(new Vector(-58.467, 159, -142.483)).setSpecLoc(new Vector(39.103, 189.01158, -155.759))
					.setBounds(new Vector(24.500, 162, -155.500), 60, 60).setGameType(GameType.FRENZY)
					.setSignLoc(new Vector(183.513, 107, 673.700)).setMapType(MapType.FRENZY)),

	Treehouse("Treehouse",
			new MapInstance("treehouse")
					.setSpawnPos(new Vector(-51.547, 110, 128.419), new Vector(-16.515, 110, 145.429),
							new Vector(-37.481, 110, 173.482), new Vector(-78.614, 110, 161.523),
							new Vector(-52.559, 138, 152.279), new Vector(-61.494, 160, 165.318))
					.setLobbyLoc(new Vector(-49.531, 140, 88.486)).setSpecLoc(new Vector(-53.866, 161.16555, 158.849))
					.setBounds(new Vector(-45.518, 173, 162.461), 60, 58).setGameType(GameType.FRENZY)
					.setSignLoc(new Vector(183.513, 108, 673.700)).setMapType(MapType.FRENZY)),

	Frigid("Frigid",
			new MapInstance("frigid")
					.setSpawnPos(new Vector(-3.453, 103, 91.461), new Vector(-28.521, 99, 95.573),
							new Vector(-39.670, 104, 97.445), new Vector(-21.557, 141, 92.255),
							new Vector(5.463, 135, 62.412), new Vector(-81.633, 119, 92.505))
					.setLobbyLoc(new Vector(45.440, 136, 93.448)).setSpecLoc(new Vector(-18.295, 140, 92.952))
					.setBounds(new Vector(-43.545, 146, 92.435), 70, 70).setGameType(GameType.FRENZY)
					.setSignLoc(new Vector(184.568, 107, 673.700)).setMapType(MapType.FRENZY)),

	DragonsDescent("DragonsDescent",
			new MapInstance("dragonsdescent")
					.setSpawnPos(new Vector(482.369, 156, -9.502), new Vector(488.629, 142, -27.326),
							new Vector(530.886, 136, -38.717), new Vector(528.271, 133, 3.666),
							new Vector(526.471, 133, 12.314), new Vector(530.452, 136, -24.538))
					.setLobbyLoc(new Vector(498.491, 151, -71.452)).setSpecLoc(new Vector(525.965, 152.19487, -24.033))
					.setBounds(new Vector(511.485, 154, -17.473), 55, 38).setSignLoc(new Vector(204.530, 107, 673.700))
					.setMapType(MapType.SCB)),

	FoundTemple("FoundTemple",
			new MapInstance("losttemple")
					.setSpawnPos(new Vector(1015.432, 174, -1082.684), new Vector(1057.729, 175, -1044.553),
							new Vector(1015.528, 176, -998.423), new Vector(972.433, 174, -1044.578),
							new Vector(1025.582, 183, -1040.508), new Vector(979.472, 172, -1080.703))
					.setLobbyLoc(new Vector(1017.507, 172, -1131.436)).setSpecLoc(new Vector(1038.500, 162, -1099.500))
					.setBounds(new Vector(1015.500, 224, -1044.500), 65, 65).setGameType(GameType.FRENZY)
					.setSignLoc(new Vector(182.542, 106, 673.700)).setMapType(MapType.FRENZY)),

	Crescent("Crescent",
			new MapInstance("crescent")
					.setSpawnPos(new Vector(5024.412, 124, 686.483), new Vector(5039.468, 124, 672.524),
							new Vector(5050.506, 124, 660.473), new Vector(5064.491, 124, 675.514),
							new Vector(5076.455, 124, 686.479), new Vector(5061.467, 124, 700.504),
							new Vector(5050.474, 124, 712.472))
					.setLobbyLoc(new Vector(5051.459, 129, 623.500)).setSpecLoc(new Vector(5050.500, 141, 686.500))
					.setBounds(new Vector(5050.500, 141, 686.500), 40, 40).setSignLoc(new Vector(-48.507, 128, -28.700))
					.setMapType(MapType.COMMUNITY)),

	WaterShrine("WaterShrine",
			new MapInstance("watershrine")
					.setSpawnPos(new Vector(5051.970, 131, 579.964), new Vector(5052.008, 131, 609.981),
							new Vector(5035.437, 131, 594.552), new Vector(5068.510, 131, 594.461))
					.setLobbyLoc(new Vector(4981.513, 154, 593.451)).setSpecLoc(new Vector(5052.006, 150, 594.466))
					.setBounds(new Vector(5052.006, 150, 594.466), 30, 35).setSignLoc(new Vector(168.300, 106, 670.539))
					.setGameType(GameType.DUEL).setMapType(MapType.COMMUNITY)),

	Monolith("Monolith",
			new MapInstance("monolith")
					.setSpawnPos(new Vector(5042.514, 123, 650.452), new Vector(5030.437, 123, 630.484),
							new Vector(5045.491, 123, 621.400), new Vector(5056.487, 123, 635.486),
							new Vector(5050.470, 123, 628.453), new Vector(5039.508, 123, 639.455))
					.setLobbyLoc(new Vector(5040.471, 149, 706.482)).setSpecLoc(new Vector(5045.500, 170, 671.500))
					.setBounds(new Vector(5044.516, 197, 634.462), 40, 40).setSignLoc(new Vector(193.487, 108, 673.700))
					.setMapType(MapType.COMMUNITY)),

	JungleBoogie("JungleBoogie",
			new MapInstance("jungleboogie")
					.setSpawnPos(new Vector(5042.456, 128, 663.371), new Vector(5053.438, 128, 678.547),
							new Vector(5028.437, 128, 696.431), new Vector(5025.982, 144, 696.978),
							new Vector(5043.984, 156, 661.968), new Vector(5043.993, 159, 686.960))
					.setLobbyLoc(new Vector(5046.492, 146, 617.470)).setSpecLoc(new Vector(5038.500, 159, 679.500))
					.setBounds(new Vector(5038.500, 159, 679.500), 35, 40).setSignLoc(new Vector(203.500, 106, 673.700))
					.setMapType(MapType.SCB)),

	TiltedTowers("TiltedTowers",
			new MapInstance("tilted")
					.setSpawnPos(new Vector(5140.440, 132, 690.524), new Vector(5125.532, 132, 724.488),
							new Vector(5103.558, 142, 722.460), new Vector(5056.004, 136, 687.438),
							new Vector(5061.442, 148, 628.472), new Vector(5119.489, 132, 643.424))
					.setLobbyLoc(new Vector(5120.586, 152, 662.533)).setSpecLoc(new Vector(5120.586, 165, 662.533))
					.setSignLoc(new Vector(184.568, 108, 673.700))
					.setBounds(new Vector(5120.586, 165, 662.533), 200, 200).setGameType(GameType.FRENZY)),

	BeachBowl("BeachBowl", new MapInstance("beachbowl")
			.setSpawnPos(new Vector(5125.516, 155, 707.513), new Vector(5108.992, 156, 709.323),
					new Vector(5112.454, 138, 685.474), new Vector(5120.477, 134, 668.532),
					new Vector(5103.480, 145, 697.456), new Vector(5141.466, 145, 696.474))
			.setLobbyLoc(new Vector(5121.535, 168, 627.535)).setSpecLoc(new Vector(5122.500, 156, 687.500))
			.setBounds(new Vector(5122.500, 156, 687.500), 40, 40).setSignLoc(new Vector(194.555, 106, 673.700))),

	FungiForest("FungiForest",
			new MapInstance("fungiforest")
					.setSpawnPos(new Vector(5056.517, 133, 624.424), new Vector(5074.509, 133, 634.432),
							new Vector(5059.555, 133, 656.499), new Vector(5068.976, 138, 657.977),
							new Vector(5038.478, 140, 637.514), new Vector(5057.418, 156, 641.470))
					.setLobbyLoc(new Vector(5060.003, 143, 545.986)).setSpecLoc(new Vector(5057.500, 144, 626.500))
					.setBounds(new Vector(5057.418, 156, 641.470), 40, 40).setSignLoc(new Vector(205.536, 106, 673.700))
					.setMapType(MapType.SCB)),

	SandTemple("SandTemple",
			new MapInstance("sandtemple")
					.setSpawnPos(new Vector(-5.500, 128, -15.537), new Vector(16.546, 123, 8.460),
							new Vector(-5.516, 128, 32.497), new Vector(-29.543, 128, 8.484))
					.setLobbyLoc(new Vector(-3.545, 144, -64.538)).setSpecLoc(new Vector(-5.480, 123, 8.448))
					.setBounds(new Vector(-5.480, 123, 8.448), 40, 30).setGameType(GameType.DUEL)
					.setSignLoc(new Vector(168.300, 107, 668.537)).setMapType(MapType.DUEL)),

	PaintBoard("PaintBoard",
			new MapInstance("paintboard")
					.setSpawnPos(new Vector(5038.546, 143, 626.512), new Vector(5020.450, 143, 633.495),
							new Vector(5020.435, 143, 617.543), new Vector(5011.502, 155, 646.445))
					.setLobbyLoc(new Vector(5088.459, 157, 626.472)).setSpecLoc(new Vector(5031.500, 148, 622.500))
					.setBounds(new Vector(5027.500, 157, 628.500), 30, 50).setMapType(MapType.COMMUNITY)
					.setSignLoc(new Vector(168.300, 107, 669.542)).setGameType(GameType.DUEL)),

	Multiverse("Multiverse", new MapInstance("multiverse")
			.setSpawnPos(new Vector(5027.470, 178, 697.573), new Vector(5048.384, 159.5, 712.458),
					new Vector(5045.360, 174, 739.441), new Vector(5092.187, 164, 731.663),
					new Vector(5075.565, 166, 764.524), new Vector(5069.549, 192, 734.550))
			.setLobbyLoc(new Vector(5042.516, 178, 657.538)).setSpecLoc(new Vector(5054.805, 187.05035, 716.117))
			.setBounds(new Vector(5059.500, 201, 732.500), 90, 58).setSignLoc(new Vector(193.487, 106, 673.700))
			.setMapType(MapType.COMMUNITY)),

	Apex("Apex",
			new MapInstance("apex")
					.setSpawnPos(new Vector(5025.599, 123, 657.440), new Vector(5065.488, 123, 663.495),
							new Vector(5056.512, 127, 680.502), new Vector(5033.467, 125, 693.585),
							new Vector(5009.634, 123, 680.307), new Vector(5029.894, 139, 694.579))
					.setLobbyLoc(new Vector(5035.477, 137, 597.452))
					.setSpecLoc(new Vector(5036.585, 140.16749, 668.634)).setSignLoc(new Vector(194.555, 108, 673.700))
					.setBounds(new Vector(5038.500, 143, 676.500), 50, 45).setMapType(MapType.COMMUNITY)),

	NetherFortress("NetherFortress", new MapInstance("netherfortress")
			.setSpawnPos(new Vector(5031.383, 145, 585.477), new Vector(5060.463, 150, 591.422),
					new Vector(5065.438, 158, 624.535), new Vector(5038.497, 145, 635.504),
					new Vector(5059.595, 145, 606.429), new Vector(5038.436, 138, 591.371))
			.setLobbyLoc(new Vector(5000.505, 155, 597.490)).setSpecLoc(new Vector(5050.741, 155.40139, 606.475))
			.setBounds(new Vector(5052.502, 160, 610.468), 30, 45).setSignLoc(new Vector(209.700, 106, 668.489))
			.setMapType(MapType.SETHBLING)),

	Clockwork("Clockwork", new MapInstance("clockwork")
			.setSpawnPos(new Vector(5001.994, 174, 606.994), new Vector(5015.599, 158, 606.437),
					new Vector(5001.069, 134, 592.949), new Vector(5000.984, 159, 592.974),
					new Vector(4985.440, 151, 605.448), new Vector(5001.538, 152, 588.452))
			.setLobbyLoc(new Vector(4941.517, 162, 596.499)).setSpecLoc(new Vector(5001.898, 175.41397, 605.166))
			.setBounds(new Vector(4999.434, 178, 604.478), 35, 30).setSignLoc(new Vector(204.530, 108, 673.700))
			.setMapType(MapType.SCB)),

	PileOfBodies("PileOfBodies", new MapInstance("pileofbodies")
			.setSpawnPos(new Vector(4905.390, 141, 581.469), new Vector(4912.392, 149, 539.494),
					new Vector(4957.479, 145, 527.348), new Vector(4991.572, 145, 550.995),
					new Vector(4975.500, 150, 568.537), new Vector(4961.483, 146, 593.510))
			.setLobbyLoc(new Vector(4946.512, 153, 631.445)).setSpecLoc(new Vector(4946.051, 154.19487, 570.383))
			.setBounds(new Vector(4947.534, 162, 548.541), 60, 60).setSignLoc(new Vector(209.700, 107, 669.464))
			.setMapType(MapType.SETHBLING)),

	Aperature("Aperature", new MapInstance("aperature")
			.setSpawnPos(new Vector(4962.509, 169, 630.467), new Vector(4950.443, 162, 633.424),
					new Vector(4929.372, 169, 633.473), new Vector(4929.443, 170, 670.440),
					new Vector(4963.443, 167, 670.540), new Vector(4945.540, 176, 656.476))
			.setLobbyLoc(new Vector(4950.502, 173, 587.524)).setSpecLoc(new Vector(4947.441, 180.73035, 651.318))
			.setBounds(new Vector(4947.520, 180, 651.493), 35, 35).setSignLoc(new Vector(195.544, 107, 673.700))
			.setMapType(MapType.COMMUNITY)),

	Mushroom("Mushroom", new MapInstance("mushroom")
			.setSpawnPos(new Vector(4983.498, 150, 806.436), new Vector(4989.533, 154, 831.486),
					new Vector(4970.462, 153, 840.350), new Vector(4959.440, 153, 858.484),
					new Vector(4983.457, 148, 887.480), new Vector(4985.492, 153, 856.439))
			.setLobbyLoc(new Vector(4906.508, 156, 853.509)).setSpecLoc(new Vector(4977.357, 159.40111, 850.104))
			.setBounds(new Vector(4972.566, 160, 847.504), 35, 60).setSignLoc(new Vector(209.700, 107, 670.454))
			.setMapType(MapType.SETHBLING)),
	MushroomCastle("MushroomCastle", new MapInstance("mushroomcastle")
			.setSpawnPos(new Vector(4909.508, 148, 861.517), new Vector(4932.512, 148, 876.490),
					new Vector(4909.417, 148, 892.463))
			.setLobbyLoc(new Vector(4907.468, 150, 944.508)).setSpecLoc(new Vector(4909.448, 195, 876.408))
			.setBounds(new Vector(4909.448, 195, 876.408), 40, 40).setGameType(GameType.DUEL)
			.setSignLoc(new Vector(168.300, 106, 667.565)).setMapType(MapType.DUEL)),

	/*
	 * Archfield("Archfield", new MapInstance("archfield") .setSpawnPos(new
	 * Vector(4918.457, 146, 773.510), new Vector(4928.979, 145, 778.960), new
	 * Vector(4938.442, 144, 781.423), new Vector(4934.485, 154, 797.487), new
	 * Vector(4939.498, 148, 794.459)) .setLobbyLoc(new Vector(4930.479, 144,
	 * 738.447)).setSpecLoc(new Vector(4928.500, 161, 784.500)) .setBounds(new
	 * Vector(4928.470, 161, 788.485), 32, 33)),
	 */

	NetherCastle("NetherCastle", new MapInstance("nethercastle")
			.setSpawnPos(new Vector(4936.450, 148, 738.493), new Vector(4929.438, 154, 715.461),
					new Vector(4956.483, 148, 718.454), new Vector(4976.488, 148, 738.484),
					new Vector(4956.460, 155, 729.497))
			.setLobbyLoc(new Vector(4884.519, 146, 733.478)).setSpecLoc(new Vector(4956.479, 149, 738.454))
			.setBounds(new Vector(4956.479, 149, 738.454), 50, 50)),

	CherryGrove("CherryGrove", new MapInstance("cherrygrove")
			.setSpawnPos(new Vector(4944.457, 153, 738.447), new Vector(4957.483, 153, 738.452),
					new Vector(5001.518, 166, 787.520), new Vector(4956.500, 165, 722.401),
					new Vector(4935.409, 160, 739.443))
			.setLobbyLoc(new Vector(4894.390, 158, 748.594)).setSpecLoc(new Vector(4951.397, 154, 738.449))
			.setBounds(new Vector(4969.568, 183, 738.493), 50, 70).setSignLoc(new Vector(205.536, 108, 673.700))),

	Mountain("Mountain", new MapInstance("mountain")
			.setSpawnPos(new Vector(4885.463, 152, 790.549), new Vector(4864.387, 152, 790.485),
					new Vector(4867.388, 168, 781.455), new Vector(4904.560, 187, 788.443),
					new Vector(4874.485, 160, 800.518))
			.setLobbyLoc(new Vector(4819.523, 186, 788.498)).setSpecLoc(new Vector(4885.436, 158, 790.454))
			.setBounds(new Vector(4885.436, 158, 790.454), 45, 40).setSignLoc(new Vector(172.561, 106, 673.700))),

	Mansion("Mansion", new MapInstance("mansion")
			.setSpawnPos(new Vector(4920.444, 152, 776.414), new Vector(4953.547, 152, 793.375),
					new Vector(4954.586, 145, 838.512), new Vector(4925.501, 149, 815.555),
					new Vector(4911.503, 157, 814.491))
			.setLobbyLoc(new Vector(4933.467, 151, 719.522)).setSpecLoc(new Vector(4922.493, 149, 812.282))
			.setBounds(new Vector(4932.483, 188, 811.481), 50, 60).setSignLoc(new Vector(204.530, 106, 673.700))),

	TempleOfMars("TempleOfMars", new MapInstance("templeofmars")
			.setSpawnPos(new Vector(4962.489, 155, 742.402), new Vector(4946.502, 153, 788.490),
					new Vector(4918.471, 149, 768.472), new Vector(4888.509, 148, 779.695),
					new Vector(4888.461, 158, 782.541))
			.setLobbyLoc(new Vector(4930.449, 163, 690.517)).setSpecLoc(new Vector(4930.428, 160, 772.552))
			.setBounds(new Vector(4930.428, 160, 772.552), 60, 40)),

	ColdWar("ColdWar", new MapInstance("coldwar")
			.setSpawnPos(new Vector(1037.504, 152, 700.492), new Vector(1031.507, 150, 743.491),
					new Vector(991.467, 151, 719.530), new Vector(1004.478, 151, 711.965),
					new Vector(971.422, 151, 685.513))
			.setLobbyLoc(new Vector(1002.428, 152, 626.585)).setSpecLoc(new Vector(1000.500, 162, 706.500))
			.setBounds(new Vector(1000.500, 162, 706.500), 60, 50)),

	WinterWorld("WinterWorld",
			new MapInstance("winterworld")
					.setSpawnPos(new Vector(4922.576, 150, 717.625), new Vector(4913.556, 188, 671.417),
							new Vector(4945.453, 195, 666.471), new Vector(4933.438, 212, 668.595),
							new Vector(4953.467, 155, 680.587))
					.setLobbyLoc(new Vector(4933.545, 181, 755.508)).setSpecLoc(new Vector(4930.500, 180, 700.500))
					.setBounds(new Vector(4932.500, 215, 676.336), 60, 60).setSignLoc(new Vector(14.700, 149, -1.548))),

	Winter("Winter", new MapInstance("winter")
			.setSpawnPos(new Vector(4860.441, 144, 689.485), new Vector(4879.495, 154, 694.437),
					new Vector(4881.514, 154, 670.416), new Vector(4916.444, 180, 673.484),
					new Vector(4898.445, 143, 660.404))
			.setLobbyLoc(new Vector(4829.660, 155, 684.561)).setSpecLoc(new Vector(4898.485, 159, 685.393))
			.setBounds(new Vector(4897.500, 182, 686.500), 50, 50).setSignLoc(new Vector(173.550, 106, 673.700))),

	BarnYard("BarnYard", new MapInstance("barnyard")
			.setSpawnPos(new Vector(4796.420, 170, 686.440), new Vector(4826.459, 152, 709.513),
					new Vector(4760.522, 152, 725.352), new Vector(4753.309, 153, 668.423),
					new Vector(4777.421, 150, 675.482), new Vector(4797.475, 150, 685.440))
			.setLobbyLoc(new Vector(4714.534, 157, 685.505)).setSpecLoc(new Vector(4784.510, 160, 686.470))
			.setBounds(new Vector(4786.500, 176, 686.500), 51, 60).setSignLoc(new Vector(193.487, 107, 673.700))),
	
	CommCollab("CommCollab", new MapInstance("communitycollab")
			.setSpawnPos(new Vector(5036.418, 170, 673.516), new Vector(5033.403, 163, 692.514),
					new Vector(5046.517, 172, 660.409), new Vector(5050.492, 183, 695.451),
					new Vector(5028.525, 184, 667.601), new Vector(5055.977, 182, 667.015))
			.setLobbyLoc(new Vector(5042.537, 171, 679.629)).setSpecLoc(new Vector(5042.537, 171, 679.629))
			.setBounds(new Vector(5042.537, 171, 679.629), 200, 200).setSignLoc(new Vector(196.474, 108, 673.700))
			.setMapType(MapType.COMMUNITY)),

	YinYang("YinYang",
			new MapInstance("yingyang")
					.setSpawnPos(new Vector(4919.463, 152, 531.388), new Vector(4955.478, 148, 558.523),
							new Vector(4926.486, 147, 583.466), new Vector(4899.306, 148, 565.624),
							new Vector(4925.478, 146, 558.324))
					.setLobbyLoc(new Vector(4926.488, 156, 493.466)).setSpecLoc(new Vector(4925.490, 150, 558.485))
					.setSignLoc(new Vector(196.474, 107, 673.700))
					.setBounds(new Vector(4925.490, 189, 558.485), 45, 42));

	private final MapInstance instance;
	private final String name;

	DuosMaps(String name, MapInstance instance) {
		this.instance = instance;
		this.name = name;
	}

	public MapInstance GetInstance() {
		return instance;
	}

	public String getName() {
		return name;
	}

}
