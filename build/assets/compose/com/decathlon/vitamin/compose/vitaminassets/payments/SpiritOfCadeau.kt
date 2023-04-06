package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.SpiritOfCadeau: ImageVector
    get() {
        if (_spiritOfCadeau != null) {
            return _spiritOfCadeau!!
        }
        _spiritOfCadeau = Builder(name = "SpiritOfCadeau", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFFF3F3F3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                lineTo(54.0f, 0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 57.5f, 4.0f)
                lineTo(57.5f, 36.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 54.0f, 39.5f)
                lineTo(4.0f, 39.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.5f, 36.0f)
                lineTo(0.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF514D57)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(40.2071f, 10.949f)
                curveTo(39.7181f, 10.9778f, 39.3262f, 10.6785f, 39.1634f, 10.2576f)
                curveTo(39.0267f, 9.9012f, 39.1958f, 9.422f, 39.5647f, 9.1882f)
                curveTo(40.0865f, 8.8585f, 40.7941f, 8.9618f, 41.138f, 9.4991f)
                curveTo(41.4475f, 9.9819f, 41.2528f, 10.5045f, 40.8077f, 10.7876f)
                curveTo(40.6177f, 10.9102f, 40.4158f, 10.9742f, 40.2071f, 10.949f)
                close()
                moveTo(5.0692f, 19.7507f)
                curveTo(5.0465f, 19.792f, 5.0237f, 19.8333f, 5.0f, 19.8739f)
                verticalLineTo(20.3756f)
                curveTo(5.0225f, 20.3902f, 5.0429f, 20.4078f, 5.0605f, 20.428f)
                curveTo(5.0979f, 20.4858f, 5.1331f, 20.5452f, 5.1683f, 20.6046f)
                curveTo(5.2467f, 20.737f, 5.3249f, 20.869f, 5.4258f, 20.9816f)
                curveTo(5.754f, 21.3495f, 6.1757f, 21.5907f, 6.626f, 21.7841f)
                curveTo(7.2019f, 22.0295f, 7.815f, 22.175f, 8.4394f, 22.2145f)
                curveTo(8.7638f, 22.2353f, 9.0923f, 22.2145f, 9.4188f, 22.1938f)
                horizontalLineTo(9.4188f)
                horizontalLineTo(9.4188f)
                horizontalLineTo(9.4188f)
                horizontalLineTo(9.4188f)
                horizontalLineTo(9.4188f)
                horizontalLineTo(9.4188f)
                horizontalLineTo(9.4188f)
                horizontalLineTo(9.4188f)
                horizontalLineTo(9.4189f)
                horizontalLineTo(9.4189f)
                horizontalLineTo(9.4189f)
                horizontalLineTo(9.4189f)
                horizontalLineTo(9.4189f)
                horizontalLineTo(9.4189f)
                lineTo(9.5498f, 22.1856f)
                curveTo(10.192f, 22.1476f, 10.8153f, 21.9529f, 11.3658f, 21.6185f)
                curveTo(11.8275f, 21.348f, 12.2087f, 20.9583f, 12.4699f, 20.4899f)
                curveTo(12.8775f, 19.7513f, 13.0126f, 18.9561f, 12.95f, 18.1142f)
                curveTo(12.9261f, 17.6997f, 12.8454f, 17.2904f, 12.71f, 16.8981f)
                curveTo(12.4969f, 16.3121f, 12.1207f, 15.7999f, 11.6261f, 15.4225f)
                curveTo(10.9843f, 14.9187f, 10.237f, 14.6068f, 9.4867f, 14.3018f)
                curveTo(9.4254f, 14.2768f, 9.364f, 14.2521f, 9.3027f, 14.2274f)
                lineTo(9.3026f, 14.2274f)
                lineTo(9.3026f, 14.2274f)
                lineTo(9.3025f, 14.2274f)
                lineTo(9.3025f, 14.2273f)
                lineTo(9.3024f, 14.2273f)
                lineTo(9.3023f, 14.2273f)
                lineTo(9.3023f, 14.2273f)
                lineTo(9.3022f, 14.2272f)
                lineTo(9.3022f, 14.2272f)
                lineTo(9.3021f, 14.2272f)
                curveTo(8.8063f, 14.0277f, 8.3103f, 13.828f, 7.8721f, 13.5039f)
                curveTo(7.5016f, 13.2298f, 7.2496f, 12.8822f, 7.2089f, 12.4267f)
                curveTo(7.141f, 11.6677f, 7.4698f, 11.0848f, 8.2421f, 10.8138f)
                curveTo(8.5536f, 10.7042f, 8.8746f, 10.6707f, 9.2023f, 10.6387f)
                curveTo(9.5477f, 10.6051f, 9.878f, 10.6518f, 10.2115f, 10.7042f)
                curveTo(10.6676f, 10.7739f, 11.0777f, 10.9784f, 11.4821f, 11.1881f)
                curveTo(11.8552f, 11.382f, 12.1349f, 11.3453f, 12.3771f, 11.0308f)
                curveTo(12.5941f, 10.7493f, 12.723f, 10.4301f, 12.6035f, 10.0678f)
                curveTo(12.5143f, 9.7958f, 12.2956f, 9.6343f, 12.0525f, 9.5122f)
                curveTo(11.3412f, 9.1547f, 10.5679f, 9.0577f, 9.7909f, 9.0142f)
                curveTo(9.4397f, 8.9947f, 9.0841f, 9.0267f, 8.7297f, 9.0586f)
                lineTo(8.7297f, 9.0586f)
                curveTo(8.6659f, 9.0644f, 8.6022f, 9.0701f, 8.5385f, 9.0756f)
                curveTo(7.9525f, 9.1253f, 7.3841f, 9.3018f, 6.8723f, 9.5929f)
                curveTo(6.2409f, 9.9509f, 5.7786f, 10.4578f, 5.5255f, 11.1603f)
                curveTo(5.3355f, 11.6834f, 5.3214f, 12.2165f, 5.3355f, 12.757f)
                curveTo(5.3468f, 13.1291f, 5.4318f, 13.4953f, 5.5855f, 13.8342f)
                curveTo(5.9325f, 14.6137f, 6.5399f, 15.1405f, 7.2809f, 15.5074f)
                curveTo(7.6956f, 15.7135f, 8.1173f, 15.9053f, 8.5389f, 16.0971f)
                curveTo(8.9174f, 16.2693f, 9.2958f, 16.4414f, 9.6693f, 16.6239f)
                curveTo(9.9477f, 16.7615f, 10.2062f, 16.9366f, 10.4374f, 17.1445f)
                curveTo(10.9973f, 17.6466f, 11.168f, 18.293f, 11.0443f, 19.0268f)
                curveTo(10.9316f, 19.6962f, 10.5261f, 20.1135f, 9.913f, 20.3426f)
                curveTo(9.4094f, 20.5302f, 8.8892f, 20.5423f, 8.3585f, 20.481f)
                curveTo(7.7469f, 20.4102f, 7.2303f, 20.1476f, 6.768f, 19.7549f)
                curveTo(6.7173f, 19.7118f, 6.6669f, 19.6682f, 6.6164f, 19.6247f)
                lineTo(6.6164f, 19.6246f)
                lineTo(6.6164f, 19.6246f)
                lineTo(6.6164f, 19.6246f)
                curveTo(6.4633f, 19.4923f, 6.3102f, 19.3599f, 6.1485f, 19.2397f)
                curveTo(6.0259f, 19.149f, 5.8949f, 19.0782f, 5.7128f, 19.1254f)
                curveTo(5.5165f, 19.1792f, 5.3468f, 19.3037f, 5.2359f, 19.475f)
                curveTo(5.1734f, 19.5618f, 5.1213f, 19.6562f, 5.0692f, 19.7507f)
                close()
                moveTo(5.1252f, 24.7531f)
                curveTo(5.2672f, 24.3495f, 5.5855f, 24.1802f, 5.9706f, 24.1f)
                curveTo(6.2231f, 24.0539f, 6.4825f, 24.0626f, 6.7314f, 24.1257f)
                curveTo(7.3179f, 24.2541f, 7.5836f, 24.7159f, 7.5987f, 25.2265f)
                curveTo(7.6201f, 25.9514f, 7.63f, 26.6785f, 7.5987f, 27.4024f)
                curveTo(7.5679f, 28.0697f, 7.1844f, 28.4943f, 6.4648f, 28.5216f)
                curveTo(6.2354f, 28.5286f, 6.0062f, 28.5057f, 5.7827f, 28.4534f)
                curveTo(5.4274f, 28.3716f, 5.2087f, 28.1289f, 5.0976f, 27.7798f)
                curveTo(5.072f, 27.7237f, 5.0904f, 24.8296f, 5.1252f, 24.7531f)
                close()
                moveTo(7.1035f, 26.3137f)
                curveTo(7.1035f, 26.3137f, 7.081f, 25.5274f, 7.0664f, 25.1316f)
                curveTo(7.056f, 24.8496f, 6.8744f, 24.664f, 6.6224f, 24.5833f)
                curveTo(6.3406f, 24.4931f, 6.053f, 24.4942f, 5.7968f, 24.6881f)
                curveTo(5.5406f, 24.8821f, 5.5093f, 25.1777f, 5.5067f, 25.4597f)
                curveTo(5.5031f, 25.8184f, 5.5113f, 26.1772f, 5.5194f, 26.5359f)
                curveTo(5.5255f, 26.8062f, 5.5317f, 27.0765f, 5.5328f, 27.3468f)
                curveTo(5.5354f, 28.0157f, 6.2028f, 28.2002f, 6.661f, 28.0105f)
                curveTo(6.9798f, 27.8784f, 7.0868f, 27.6006f, 7.1009f, 27.2845f)
                curveTo(7.1106f, 27.0661f, 7.1081f, 26.8401f, 7.1057f, 26.6149f)
                curveTo(7.1046f, 26.514f, 7.1035f, 26.4134f, 7.1035f, 26.3137f)
                close()
                moveTo(31.0782f, 17.2766f)
                verticalLineTo(16.485f)
                curveTo(31.2258f, 16.485f, 31.3721f, 16.4849f, 31.5175f, 16.4847f)
                curveTo(31.9499f, 16.4842f, 32.3739f, 16.4837f, 32.7977f, 16.4876f)
                curveTo(32.8522f, 16.4989f, 32.899f, 16.5338f, 32.9255f, 16.5831f)
                curveTo(33.1062f, 16.9277f, 33.2827f, 17.2744f, 33.4593f, 17.6213f)
                lineTo(33.4593f, 17.6213f)
                lineTo(33.4593f, 17.6214f)
                lineTo(33.4593f, 17.6214f)
                lineTo(33.4594f, 17.6214f)
                lineTo(33.4594f, 17.6215f)
                lineTo(33.4594f, 17.6215f)
                lineTo(33.4594f, 17.6215f)
                lineTo(33.4594f, 17.6216f)
                lineTo(33.4594f, 17.6216f)
                lineTo(33.583f, 17.8642f)
                curveTo(33.6638f, 18.0222f, 33.7447f, 18.1803f, 33.8257f, 18.3384f)
                lineTo(33.8259f, 18.3389f)
                curveTo(34.0086f, 18.6955f, 34.1913f, 19.0522f, 34.372f, 19.4095f)
                curveTo(34.5277f, 19.7167f, 34.6828f, 20.0243f, 34.8378f, 20.3319f)
                curveTo(35.0316f, 20.7162f, 35.2253f, 21.1006f, 35.4204f, 21.4843f)
                curveTo(35.4792f, 21.607f, 35.549f, 21.724f, 35.6291f, 21.8339f)
                curveTo(35.7836f, 22.0352f, 36.0012f, 22.161f, 36.2501f, 22.1432f)
                curveTo(36.6156f, 22.1206f, 36.9527f, 21.9375f, 37.1716f, 21.6426f)
                curveTo(37.3678f, 21.3836f, 37.433f, 21.1671f, 37.2671f, 20.8699f)
                curveTo(37.1502f, 20.6602f, 37.0344f, 20.4506f, 36.9222f, 20.2409f)
                lineTo(35.4193f, 17.3919f)
                curveTo(35.2162f, 17.0075f, 35.0128f, 16.6231f, 34.8093f, 16.2387f)
                curveTo(34.8211f, 16.2327f, 34.831f, 16.2274f, 34.8398f, 16.2228f)
                lineTo(34.8399f, 16.2227f)
                curveTo(34.8564f, 16.214f, 34.8689f, 16.2074f, 34.8818f, 16.202f)
                curveTo(34.902f, 16.1942f, 34.9225f, 16.1878f, 34.9434f, 16.1826f)
                curveTo(35.6487f, 16.0001f, 36.2666f, 15.5719f, 36.6868f, 14.9743f)
                curveTo(37.0699f, 14.4396f, 37.2384f, 13.8232f, 37.2812f, 13.1816f)
                curveTo(37.3266f, 12.4991f, 37.2995f, 11.8166f, 37.0568f, 11.1587f)
                curveTo(36.834f, 10.558f, 36.4671f, 10.0668f, 35.9349f, 9.7193f)
                curveTo(35.281f, 9.2931f, 34.539f, 9.0976f, 33.7719f, 9.0803f)
                curveTo(32.8437f, 9.059f, 31.9143f, 9.0639f, 30.9848f, 9.0687f)
                curveTo(30.5839f, 9.0708f, 30.1829f, 9.0729f, 29.782f, 9.0729f)
                curveTo(29.5963f, 9.0735f, 29.4246f, 9.1432f, 29.3463f, 9.3141f)
                curveTo(29.2683f, 9.4732f, 29.2241f, 9.6469f, 29.2164f, 9.8241f)
                curveTo(29.2125f, 13.6479f, 29.2106f, 17.4717f, 29.2106f, 21.2956f)
                curveTo(29.2089f, 21.3235f, 29.2089f, 21.3515f, 29.2106f, 21.3794f)
                curveTo(29.2472f, 21.6766f, 29.2983f, 21.8564f, 29.6693f, 21.998f)
                curveTo(29.9351f, 22.1042f, 30.2279f, 22.1215f, 30.5042f, 22.0472f)
                curveTo(30.8116f, 21.9618f, 31.0934f, 21.7972f, 31.0861f, 21.3516f)
                curveTo(31.0703f, 20.3759f, 31.0732f, 19.4001f, 31.076f, 18.4242f)
                verticalLineTo(18.4241f)
                verticalLineTo(18.424f)
                verticalLineTo(18.4239f)
                verticalLineTo(18.4238f)
                verticalLineTo(18.4237f)
                verticalLineTo(18.4237f)
                verticalLineTo(18.4236f)
                verticalLineTo(18.4235f)
                verticalLineTo(18.4234f)
                verticalLineTo(18.4233f)
                verticalLineTo(18.4232f)
                verticalLineTo(18.4231f)
                verticalLineTo(18.423f)
                verticalLineTo(18.4229f)
                curveTo(31.0771f, 18.0409f, 31.0782f, 17.6587f, 31.0782f, 17.2766f)
                close()
                moveTo(31.0892f, 14.9759f)
                verticalLineTo(10.7493f)
                verticalLineTo(10.7488f)
                curveTo(31.2984f, 10.7488f, 31.507f, 10.7491f, 31.715f, 10.7495f)
                curveTo(32.2334f, 10.7503f, 32.7487f, 10.7512f, 33.2637f, 10.7467f)
                curveTo(33.6405f, 10.7369f, 34.0155f, 10.8024f, 34.3668f, 10.9396f)
                curveTo(34.8724f, 11.143f, 35.1772f, 11.5204f, 35.3134f, 12.0294f)
                curveTo(35.4746f, 12.6348f, 35.4746f, 13.2434f, 35.2534f, 13.8405f)
                curveTo(35.0613f, 14.3599f, 34.6908f, 14.6808f, 34.169f, 14.8433f)
                curveTo(33.8022f, 14.9575f, 33.4286f, 14.9759f, 33.0492f, 14.9759f)
                horizontalLineTo(31.0892f)
                close()
                moveTo(16.954f, 17.0548f)
                verticalLineTo(17.253f)
                curveTo(16.954f, 17.63f, 16.9533f, 18.0071f, 16.9526f, 18.3841f)
                verticalLineTo(18.3844f)
                curveTo(16.9508f, 19.3602f, 16.949f, 20.336f, 16.9592f, 21.3118f)
                curveTo(16.9634f, 21.7406f, 16.7771f, 21.9246f, 16.4275f, 22.0289f)
                curveTo(16.0913f, 22.139f, 15.7254f, 22.1101f, 15.4104f, 21.9487f)
                curveTo(15.2017f, 21.8439f, 15.0812f, 21.6798f, 15.0817f, 21.4245f)
                curveTo(15.0858f, 17.5168f, 15.0867f, 13.6091f, 15.0843f, 9.7014f)
                curveTo(15.0843f, 9.3345f, 15.3415f, 9.0724f, 15.7105f, 9.0724f)
                curveTo(16.0915f, 9.0724f, 16.4725f, 9.0714f, 16.8535f, 9.0703f)
                curveTo(17.8138f, 9.0676f, 18.774f, 9.065f, 19.7338f, 9.0792f)
                curveTo(20.2222f, 9.0866f, 20.697f, 9.2134f, 21.1557f, 9.4021f)
                curveTo(21.5089f, 9.5472f, 21.8324f, 9.7564f, 22.1101f, 10.0191f)
                curveTo(22.4089f, 10.3023f, 22.6432f, 10.647f, 22.7969f, 11.0297f)
                curveTo(23.0254f, 11.5891f, 23.1147f, 12.1709f, 23.1381f, 12.7748f)
                curveTo(23.1653f, 13.4615f, 23.1178f, 14.134f, 22.895f, 14.7835f)
                curveTo(22.5229f, 15.8686f, 21.7647f, 16.5437f, 20.671f, 16.8588f)
                curveTo(20.1313f, 17.0058f, 19.5731f, 17.0725f, 19.0142f, 17.0569f)
                curveTo(18.539f, 17.0514f, 18.0638f, 17.0526f, 17.58f, 17.0538f)
                curveTo(17.3732f, 17.0543f, 17.1647f, 17.0548f, 16.954f, 17.0548f)
                close()
                moveTo(16.9597f, 15.5451f)
                horizontalLineTo(17.1043f)
                horizontalLineTo(19.441f)
                curveTo(19.5559f, 15.5434f, 19.6702f, 15.5286f, 19.7818f, 15.5011f)
                curveTo(20.4847f, 15.3344f, 20.9433f, 14.8936f, 21.1385f, 14.2043f)
                curveTo(21.3158f, 13.5683f, 21.3316f, 12.8979f, 21.1844f, 12.2543f)
                curveTo(20.97f, 11.274f, 20.2618f, 10.743f, 19.261f, 10.7493f)
                curveTo(18.7899f, 10.7524f, 18.3189f, 10.7514f, 17.8479f, 10.7503f)
                curveTo(17.6124f, 10.7498f, 17.3768f, 10.7493f, 17.1413f, 10.7493f)
                horizontalLineTo(16.9582f)
                lineTo(16.9597f, 15.5451f)
                close()
                moveTo(45.7374f, 10.7823f)
                horizontalLineTo(45.2923f)
                curveTo(45.0799f, 10.7823f, 44.8674f, 10.7806f, 44.655f, 10.7789f)
                curveTo(44.1496f, 10.7749f, 43.6441f, 10.7708f, 43.1397f, 10.7897f)
                curveTo(42.6894f, 10.8064f, 42.5f, 10.5601f, 42.4092f, 10.2314f)
                curveTo(42.3123f, 9.9121f, 42.3661f, 9.5659f, 42.5553f, 9.2915f)
                curveTo(42.6409f, 9.1472f, 42.7989f, 9.0623f, 42.966f, 9.0708f)
                horizontalLineTo(50.3237f)
                curveTo(50.6504f, 9.0708f, 50.8852f, 9.2763f, 50.9499f, 9.6013f)
                curveTo(51.0049f, 9.8595f, 50.983f, 10.1283f, 50.8868f, 10.374f)
                curveTo(50.7866f, 10.6277f, 50.5961f, 10.7813f, 50.3341f, 10.7813f)
                horizontalLineTo(47.6405f)
                verticalLineTo(10.9815f)
                curveTo(47.6405f, 11.8724f, 47.6401f, 12.7635f, 47.6397f, 13.6547f)
                verticalLineTo(13.6551f)
                verticalLineTo(13.6555f)
                verticalLineTo(13.6559f)
                verticalLineTo(13.6562f)
                verticalLineTo(13.6566f)
                verticalLineTo(13.657f)
                verticalLineTo(13.6574f)
                verticalLineTo(13.6578f)
                verticalLineTo(13.6582f)
                verticalLineTo(13.6586f)
                verticalLineTo(13.659f)
                curveTo(47.6386f, 16.1749f, 47.6375f, 18.6919f, 47.6452f, 21.208f)
                curveTo(47.6452f, 21.8517f, 47.3023f, 22.0163f, 46.8249f, 22.0792f)
                curveTo(46.5349f, 22.1267f, 46.2377f, 22.0627f, 45.9926f, 21.8999f)
                curveTo(45.8221f, 21.7948f, 45.7221f, 21.6048f, 45.7316f, 21.4041f)
                verticalLineTo(11.0098f)
                lineTo(45.7374f, 10.7823f)
                close()
                moveTo(26.7372f, 21.2961f)
                verticalLineTo(17.5586f)
                curveTo(26.7372f, 16.268f, 26.7377f, 14.9773f, 26.7387f, 13.6864f)
                curveTo(26.7393f, 13.5113f, 26.6584f, 13.3954f, 26.5227f, 13.2906f)
                curveTo(26.2211f, 13.0578f, 25.8673f, 13.0537f, 25.5312f, 13.1103f)
                curveTo(25.0679f, 13.1889f, 24.8706f, 13.4028f, 24.8706f, 13.786f)
                curveTo(24.8661f, 16.3115f, 24.8661f, 18.8369f, 24.8706f, 21.3621f)
                curveTo(24.8706f, 21.5749f, 24.9463f, 21.7626f, 25.1446f, 21.8895f)
                curveTo(25.458f, 22.0978f, 25.8507f, 22.1461f, 26.2049f, 22.02f)
                curveTo(26.5911f, 21.8958f, 26.7372f, 21.695f, 26.7372f, 21.2961f)
                close()
                moveTo(41.1598f, 18.6311f)
                verticalLineTo(18.6312f)
                curveTo(41.1564f, 19.4774f, 41.1531f, 20.3237f, 41.1693f, 21.1697f)
                curveTo(41.1813f, 21.7831f, 40.8766f, 21.9885f, 40.3777f, 22.0766f)
                curveTo(39.9947f, 22.1442f, 39.6284f, 22.0368f, 39.3701f, 21.7097f)
                curveTo(39.324f, 21.6493f, 39.2979f, 21.576f, 39.2954f, 21.5f)
                curveTo(39.2916f, 18.885f, 39.2932f, 16.2698f, 39.3001f, 13.6544f)
                curveTo(39.3089f, 13.5189f, 39.3752f, 13.3938f, 39.4823f, 13.311f)
                curveTo(39.6506f, 13.2052f, 39.8389f, 13.1356f, 40.0354f, 13.1066f)
                curveTo(40.2805f, 13.068f, 40.5316f, 13.0989f, 40.7602f, 13.1957f)
                curveTo(41.0456f, 13.3173f, 41.1615f, 13.5349f, 41.162f, 13.8289f)
                curveTo(41.1637f, 15.0793f, 41.1639f, 16.3304f, 41.1625f, 17.5822f)
                curveTo(41.1625f, 17.9316f, 41.1611f, 18.2811f, 41.1598f, 18.6307f)
                verticalLineTo(18.6307f)
                verticalLineTo(18.6308f)
                verticalLineTo(18.6308f)
                verticalLineTo(18.6309f)
                verticalLineTo(18.631f)
                verticalLineTo(18.631f)
                verticalLineTo(18.6311f)
                verticalLineTo(18.6311f)
                close()
                moveTo(18.6567f, 26.2623f)
                verticalLineTo(24.3511f)
                curveTo(18.6567f, 24.1414f, 18.7287f, 24.067f, 18.9448f, 24.0659f)
                curveTo(19.058f, 24.0659f, 19.1713f, 24.0641f, 19.2846f, 24.0622f)
                horizontalLineTo(19.2846f)
                curveTo(19.5332f, 24.0582f, 19.7818f, 24.0541f, 20.0291f, 24.0696f)
                curveTo(20.5989f, 24.1058f, 21.0127f, 24.2882f, 21.2053f, 24.8999f)
                curveTo(21.2391f, 25.0094f, 21.2567f, 25.1233f, 21.2575f, 25.238f)
                curveTo(21.2622f, 25.9362f, 21.2669f, 26.635f, 21.2575f, 27.3348f)
                curveTo(21.2528f, 27.6404f, 21.1641f, 27.9287f, 20.9444f, 28.1562f)
                curveTo(20.7342f, 28.3679f, 20.4494f, 28.4879f, 20.1517f, 28.4901f)
                curveTo(19.8635f, 28.5015f, 19.575f, 28.499f, 19.2865f, 28.4965f)
                horizontalLineTo(19.2864f)
                horizontalLineTo(19.2864f)
                horizontalLineTo(19.2863f)
                horizontalLineTo(19.2863f)
                horizontalLineTo(19.2862f)
                horizontalLineTo(19.2862f)
                horizontalLineTo(19.2862f)
                horizontalLineTo(19.2861f)
                horizontalLineTo(19.2861f)
                curveTo(19.1631f, 28.4954f, 19.0401f, 28.4943f, 18.9171f, 28.4943f)
                curveTo(18.7188f, 28.4943f, 18.6562f, 28.4314f, 18.6562f, 28.2249f)
                curveTo(18.6562f, 27.5703f, 18.6564f, 26.9161f, 18.6567f, 26.2623f)
                close()
                moveTo(19.1952f, 28.0571f)
                curveTo(19.2489f, 28.0571f, 19.3003f, 28.0576f, 19.3501f, 28.0581f)
                curveTo(19.4454f, 28.059f, 19.5352f, 28.0599f, 19.6257f, 28.0571f)
                curveTo(19.6897f, 28.0552f, 19.7554f, 28.0488f, 19.8217f, 28.0424f)
                curveTo(19.8983f, 28.035f, 19.9755f, 28.0276f, 20.0515f, 28.0267f)
                curveTo(20.5243f, 28.0199f, 20.7492f, 27.664f, 20.7565f, 27.2656f)
                curveTo(20.7682f, 26.6256f, 20.7626f, 25.9857f, 20.757f, 25.3453f)
                lineTo(20.7565f, 25.2899f)
                curveTo(20.7565f, 24.9549f, 20.5478f, 24.6252f, 20.2608f, 24.5812f)
                curveTo(20.0164f, 24.5446f, 19.7672f, 24.5381f, 19.5168f, 24.5317f)
                horizontalLineTo(19.5168f)
                horizontalLineTo(19.5167f)
                horizontalLineTo(19.5167f)
                horizontalLineTo(19.5167f)
                horizontalLineTo(19.5167f)
                horizontalLineTo(19.5167f)
                horizontalLineTo(19.5167f)
                horizontalLineTo(19.5167f)
                horizontalLineTo(19.5167f)
                curveTo(19.4088f, 24.5289f, 19.3007f, 24.5261f, 19.1926f, 24.5209f)
                lineTo(19.1952f, 28.0571f)
                close()
                moveTo(31.0782f, 25.8602f)
                verticalLineTo(27.3353f)
                curveTo(31.0782f, 28.0461f, 30.6034f, 28.5294f, 29.8864f, 28.5268f)
                curveTo(29.6401f, 28.5268f, 29.3995f, 28.5268f, 29.1558f, 28.4377f)
                curveTo(28.7984f, 28.3093f, 28.4827f, 27.9051f, 28.4775f, 27.5151f)
                curveTo(28.4614f, 26.6959f, 28.4546f, 25.8768f, 28.4478f, 25.0574f)
                curveTo(28.4458f, 24.8118f, 28.4437f, 24.5663f, 28.4415f, 24.3207f)
                curveTo(28.4415f, 24.1582f, 28.5276f, 24.0733f, 28.6925f, 24.0654f)
                curveTo(28.7645f, 24.0569f, 28.8366f, 24.0801f, 28.8905f, 24.1288f)
                curveTo(28.9443f, 24.1776f, 28.9747f, 24.2473f, 28.9737f, 24.3201f)
                curveTo(28.9769f, 24.5061f, 28.9758f, 24.6921f, 28.9748f, 24.8782f)
                verticalLineTo(24.8783f)
                verticalLineTo(24.8784f)
                verticalLineTo(24.8785f)
                verticalLineTo(24.8786f)
                verticalLineTo(24.8787f)
                verticalLineTo(24.8789f)
                verticalLineTo(24.879f)
                lineTo(28.9748f, 24.8799f)
                curveTo(28.9742f, 24.9728f, 28.9737f, 25.0658f, 28.9737f, 25.1589f)
                verticalLineTo(27.3547f)
                curveTo(28.9655f, 27.7193f, 29.2386f, 28.0286f, 29.5999f, 28.0639f)
                curveTo(29.9088f, 28.0996f, 30.1682f, 28.0472f, 30.3894f, 27.8244f)
                curveTo(30.535f, 27.6776f, 30.5705f, 27.4889f, 30.5716f, 27.297f)
                lineTo(30.5725f, 27.0976f)
                verticalLineTo(27.0974f)
                curveTo(30.577f, 26.1863f, 30.5815f, 25.2746f, 30.5674f, 24.3616f)
                curveTo(30.5637f, 24.1152f, 30.7427f, 24.0161f, 30.9551f, 24.0947f)
                curveTo(31.0626f, 24.1346f, 31.0762f, 24.2038f, 31.0756f, 24.2997f)
                curveTo(31.0772f, 24.8208f, 31.0782f, 25.3402f, 31.0782f, 25.8602f)
                close()
                moveTo(17.3688f, 27.4868f)
                lineTo(17.0578f, 27.4866f)
                horizontalLineTo(17.0574f)
                horizontalLineTo(17.0574f)
                horizontalLineTo(17.0574f)
                horizontalLineTo(17.0573f)
                horizontalLineTo(17.0573f)
                horizontalLineTo(17.0573f)
                horizontalLineTo(17.0573f)
                curveTo(16.6646f, 27.4861f, 16.2739f, 27.4857f, 15.8822f, 27.4915f)
                curveTo(15.8253f, 27.5053f, 15.7785f, 27.5457f, 15.7564f, 27.6f)
                curveTo(15.7078f, 27.7441f, 15.6645f, 27.8898f, 15.6211f, 28.0355f)
                curveTo(15.5872f, 28.1496f, 15.5533f, 28.2636f, 15.5169f, 28.3769f)
                curveTo(15.4814f, 28.4891f, 15.3379f, 28.5341f, 15.196f, 28.4854f)
                curveTo(15.0671f, 28.4419f, 14.9904f, 28.3166f, 15.0253f, 28.206f)
                curveTo(15.0835f, 28.0219f, 15.142f, 27.838f, 15.2004f, 27.654f)
                lineTo(15.2007f, 27.6532f)
                lineTo(15.2009f, 27.6524f)
                lineTo(15.2012f, 27.6516f)
                lineTo(15.2015f, 27.6507f)
                lineTo(15.2017f, 27.6499f)
                curveTo(15.3299f, 27.2464f, 15.4582f, 26.8429f, 15.5837f, 26.4384f)
                curveTo(15.7186f, 26.0034f, 15.8519f, 25.5679f, 15.9851f, 25.1324f)
                curveTo(16.074f, 24.842f, 16.1628f, 24.5516f, 16.2521f, 24.2614f)
                curveTo(16.2996f, 24.1068f, 16.4259f, 24.025f, 16.5981f, 24.0318f)
                curveTo(16.7547f, 24.0381f, 16.871f, 24.1141f, 16.918f, 24.2667f)
                curveTo(17.0207f, 24.6018f, 17.1212f, 24.9378f, 17.2217f, 25.2738f)
                curveTo(17.2902f, 25.5028f, 17.3586f, 25.7317f, 17.4278f, 25.9604f)
                lineTo(17.5477f, 26.3576f)
                lineTo(17.5478f, 26.3579f)
                lineTo(17.5479f, 26.3579f)
                lineTo(17.5479f, 26.358f)
                lineTo(17.5479f, 26.358f)
                lineTo(17.5479f, 26.3581f)
                lineTo(17.5479f, 26.3582f)
                lineTo(17.5479f, 26.3582f)
                curveTo(17.7319f, 26.9679f, 17.9159f, 27.5775f, 18.1062f, 28.185f)
                curveTo(18.1505f, 28.3255f, 18.0926f, 28.4251f, 17.9324f, 28.4849f)
                curveTo(17.7722f, 28.5446f, 17.6673f, 28.4912f, 17.6224f, 28.3449f)
                curveTo(17.564f, 28.153f, 17.5075f, 27.96f, 17.4495f, 27.7617f)
                curveTo(17.4231f, 27.6713f, 17.3963f, 27.5798f, 17.3688f, 27.4868f)
                close()
                moveTo(16.5939f, 24.8433f)
                lineTo(16.5637f, 24.8459f)
                lineTo(15.9082f, 27.0444f)
                horizontalLineTo(17.2399f)
                lineTo(16.5939f, 24.8433f)
                close()
                moveTo(25.5404f, 27.7498f)
                lineTo(25.5406f, 27.7492f)
                curveTo(25.5657f, 27.6624f, 25.5911f, 27.575f, 25.6168f, 27.4868f)
                curveTo(25.7488f, 27.4868f, 25.8808f, 27.4877f, 26.0127f, 27.4885f)
                horizontalLineTo(26.0128f)
                curveTo(26.3423f, 27.4907f, 26.6712f, 27.4928f, 26.9991f, 27.4816f)
                curveTo(27.1766f, 27.4753f, 27.2366f, 27.5466f, 27.2721f, 27.6996f)
                curveTo(27.3221f, 27.9161f, 27.3837f, 28.13f, 27.4469f, 28.3433f)
                curveTo(27.4886f, 28.4843f, 27.6212f, 28.5368f, 27.785f, 28.4875f)
                curveTo(27.8486f, 28.4724f, 27.9025f, 28.4301f, 27.9326f, 28.3718f)
                curveTo(27.9627f, 28.3135f, 27.966f, 28.2449f, 27.9416f, 28.184f)
                curveTo(27.886f, 28.002f, 27.8307f, 27.8199f, 27.7754f, 27.6378f)
                lineTo(27.775f, 27.6367f)
                lineTo(27.7747f, 27.6356f)
                lineTo(27.7744f, 27.6345f)
                curveTo(27.685f, 27.3404f, 27.5957f, 27.0463f, 27.5053f, 26.7524f)
                curveTo(27.4316f, 26.5124f, 27.3574f, 26.2725f, 27.2832f, 26.0327f)
                lineTo(27.2819f, 26.0283f)
                curveTo(27.1002f, 25.4409f, 26.9185f, 24.8537f, 26.744f, 24.2641f)
                curveTo(26.6892f, 24.0795f, 26.5592f, 24.0439f, 26.4131f, 24.0366f)
                curveTo(26.267f, 24.0292f, 26.146f, 24.0795f, 26.0938f, 24.2531f)
                curveTo(26.0092f, 24.5459f, 25.9179f, 24.837f, 25.8267f, 25.1282f)
                curveTo(25.7801f, 25.2769f, 25.7335f, 25.4256f, 25.6878f, 25.5745f)
                lineTo(24.8873f, 28.1876f)
                curveTo(24.8351f, 28.3543f, 24.8732f, 28.4256f, 25.0439f, 28.4838f)
                curveTo(25.2004f, 28.5368f, 25.323f, 28.4843f, 25.3679f, 28.3365f)
                curveTo(25.4266f, 28.1425f, 25.4831f, 27.9477f, 25.5404f, 27.7498f)
                close()
                moveTo(26.4272f, 24.847f)
                lineTo(27.0748f, 27.0433f)
                lineTo(25.7426f, 27.0439f)
                lineTo(26.3969f, 24.847f)
                horizontalLineTo(26.4272f)
                close()
                moveTo(22.6043f, 26.0783f)
                verticalLineTo(24.5351f)
                verticalLineTo(24.534f)
                horizontalLineTo(24.3931f)
                curveTo(24.5549f, 24.534f, 24.628f, 24.4732f, 24.6337f, 24.3118f)
                curveTo(24.6394f, 24.1503f, 24.5622f, 24.0654f, 24.3957f, 24.0654f)
                curveTo(23.7055f, 24.0629f, 23.0155f, 24.0629f, 22.3257f, 24.0654f)
                curveTo(22.1655f, 24.0659f, 22.0961f, 24.1409f, 22.0961f, 24.2981f)
                curveTo(22.0946f, 24.9028f, 22.0948f, 25.5075f, 22.095f, 26.1122f)
                curveTo(22.0953f, 26.8379f, 22.0955f, 27.5636f, 22.0929f, 28.2893f)
                curveTo(22.0924f, 28.4387f, 22.1592f, 28.4912f, 22.2876f, 28.4912f)
                horizontalLineTo(24.4411f)
                curveTo(24.5909f, 28.4912f, 24.64f, 28.3984f, 24.6342f, 28.2668f)
                curveTo(24.6285f, 28.1352f, 24.5852f, 28.0535f, 24.4323f, 28.0535f)
                horizontalLineTo(22.7797f)
                horizontalLineTo(22.6095f)
                verticalLineTo(26.5102f)
                curveTo(22.7037f, 26.5102f, 22.7965f, 26.511f, 22.8883f, 26.5118f)
                horizontalLineTo(22.8884f)
                horizontalLineTo(22.8884f)
                horizontalLineTo(22.8885f)
                horizontalLineTo(22.8885f)
                curveTo(23.0693f, 26.5133f, 23.2463f, 26.5147f, 23.4231f, 26.5102f)
                curveTo(23.541f, 26.5076f, 23.6751f, 26.5024f, 23.6975f, 26.3404f)
                curveTo(23.7231f, 26.1543f, 23.6537f, 26.0783f, 23.4622f, 26.0783f)
                horizontalLineTo(22.6043f)
                close()
                moveTo(12.112f, 26.3095f)
                verticalLineTo(25.2868f)
                curveTo(12.112f, 24.6525f, 12.5148f, 24.1608f, 13.1514f, 24.0921f)
                curveTo(13.607f, 24.0434f, 14.0125f, 24.1099f, 14.3777f, 24.3977f)
                curveTo(14.5797f, 24.555f, 14.7665f, 25.0268f, 14.6872f, 25.2569f)
                curveTo(14.632f, 25.4171f, 14.5201f, 25.4115f, 14.4028f, 25.4056f)
                lineTo(14.385f, 25.4047f)
                curveTo(14.3319f, 25.4072f, 14.2801f, 25.3874f, 14.2421f, 25.35f)
                curveTo(14.2041f, 25.3126f, 14.1833f, 25.261f, 14.1847f, 25.2076f)
                curveTo(14.1763f, 24.9224f, 14.0615f, 24.7049f, 13.7922f, 24.6043f)
                curveTo(13.4651f, 24.4821f, 13.1379f, 24.4863f, 12.853f, 24.7175f)
                curveTo(12.6755f, 24.8611f, 12.6192f, 25.075f, 12.6171f, 25.2915f)
                lineTo(12.6163f, 25.3645f)
                curveTo(12.6087f, 26.0216f, 12.6011f, 26.6787f, 12.6197f, 27.3358f)
                curveTo(12.6301f, 27.7028f, 12.7966f, 28.0304f, 13.261f, 28.055f)
                curveTo(13.4054f, 28.0695f, 13.551f, 28.0665f, 13.6947f, 28.0461f)
                curveTo(13.9691f, 27.9937f, 14.169f, 27.7316f, 14.1836f, 27.4485f)
                curveTo(14.1946f, 27.2305f, 14.2906f, 27.155f, 14.5207f, 27.1864f)
                curveTo(14.6454f, 27.2022f, 14.7367f, 27.3615f, 14.7169f, 27.5146f)
                curveTo(14.6235f, 28.2359f, 14.0772f, 28.5074f, 13.5167f, 28.5273f)
                curveTo(13.2428f, 28.5368f, 12.9745f, 28.5326f, 12.7168f, 28.3984f)
                curveTo(12.3144f, 28.1887f, 12.1386f, 27.8454f, 12.1161f, 27.4171f)
                curveTo(12.1027f, 27.1607f, 12.1059f, 26.904f, 12.1091f, 26.6475f)
                curveTo(12.1106f, 26.5348f, 12.112f, 26.4221f, 12.112f, 26.3095f)
                close()
                moveTo(8.9466f, 26.0783f)
                verticalLineTo(24.5351f)
                lineTo(10.6707f, 24.5319f)
                curveTo(10.8815f, 24.5314f, 10.9405f, 24.4779f, 10.9405f, 24.2924f)
                curveTo(10.9405f, 24.1178f, 10.8778f, 24.0622f, 10.6796f, 24.0622f)
                horizontalLineTo(8.7608f)
                curveTo(8.479f, 24.0622f, 8.4039f, 24.1409f, 8.4039f, 24.4292f)
                verticalLineTo(28.1667f)
                curveTo(8.4011f, 28.2111f, 8.4031f, 28.2558f, 8.4096f, 28.2998f)
                curveTo(8.4446f, 28.4608f, 8.5312f, 28.5116f, 8.7311f, 28.4917f)
                curveTo(8.8787f, 28.477f, 8.9398f, 28.3905f, 8.9398f, 28.2474f)
                verticalLineTo(27.1749f)
                verticalLineTo(26.5212f)
                curveTo(8.9532f, 26.5199f, 8.9646f, 26.5185f, 8.9746f, 26.5172f)
                lineTo(8.9747f, 26.5172f)
                lineTo(8.9748f, 26.5172f)
                curveTo(8.992f, 26.515f, 9.0054f, 26.5134f, 9.0186f, 26.5134f)
                curveTo(9.104f, 26.5134f, 9.1894f, 26.514f, 9.2748f, 26.5147f)
                curveTo(9.4453f, 26.5159f, 9.6158f, 26.5172f, 9.7862f, 26.5134f)
                curveTo(9.973f, 26.5097f, 10.0466f, 26.4316f, 10.0424f, 26.2686f)
                curveTo(10.0372f, 26.0903f, 9.9192f, 26.0783f, 9.7815f, 26.0783f)
                horizontalLineTo(8.9466f)
                close()
                moveTo(24.8419f, 10.429f)
                curveTo(25.0364f, 10.7712f, 25.4062f, 10.974f, 25.7979f, 10.9532f)
                curveTo(25.7979f, 10.9532f, 26.1913f, 10.9018f, 26.3599f, 10.8148f)
                curveTo(26.7615f, 10.6211f, 26.9673f, 10.1663f, 26.8483f, 9.735f)
                curveTo(26.685f, 9.139f, 25.9002f, 8.8313f, 25.2943f, 9.1217f)
                curveTo(24.7402f, 9.3869f, 24.5961f, 10.0264f, 24.8419f, 10.429f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1D5FA9)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(41.677f, 30.708f)
                curveTo(41.4728f, 30.1404f, 41.0022f, 28.7616f, 41.0022f, 28.7616f)
                lineTo(54.0f, 23.0f)
                curveTo(53.7803f, 23.0356f, 40.6845f, 25.6096f, 40.0124f, 25.7454f)
                curveTo(39.9138f, 25.44f, 39.8161f, 25.1368f, 39.7188f, 24.835f)
                curveTo(39.5984f, 24.4614f, 39.4786f, 24.0898f, 39.3586f, 23.7184f)
                curveTo(39.2163f, 23.2787f, 38.4756f, 21.1975f, 38.4344f, 21.153f)
                curveTo(38.4099f, 21.1828f, 37.914f, 22.5955f, 37.6945f, 23.2728f)
                curveTo(37.445f, 24.0439f, 36.7275f, 25.7438f, 36.7275f, 25.7438f)
                lineTo(32.1297f, 25.7984f)
                curveTo(32.8445f, 26.3811f, 33.5818f, 26.9352f, 34.3192f, 27.4894f)
                curveTo(34.8587f, 27.8948f, 35.3982f, 28.3003f, 35.9291f, 28.7171f)
                lineTo(33.9984f, 32.5321f)
                curveTo(34.1912f, 32.4474f, 34.381f, 32.3641f, 34.5687f, 32.2818f)
                curveTo(35.0616f, 32.0655f, 35.5394f, 31.8558f, 36.0168f, 31.6447f)
                curveTo(36.8011f, 31.2982f, 38.4417f, 30.5971f, 38.4417f, 30.5971f)
                curveTo(38.4417f, 30.5971f, 38.9766f, 31.0282f, 39.2004f, 31.2332f)
                curveTo(39.5876f, 31.5876f, 39.9745f, 31.9423f, 40.361f, 32.2973f)
                curveTo(40.7527f, 32.6562f, 41.1432f, 33.016f, 41.5325f, 33.3766f)
                curveTo(41.9953f, 33.8054f, 43.0286f, 34.6971f, 43.1136f, 34.7207f)
                curveTo(43.0703f, 34.588f, 42.1251f, 31.9492f, 41.677f, 30.708f)
                close()
                moveTo(40.3996f, 27.8757f)
                lineTo(39.0f, 28.0f)
                lineTo(39.8542f, 29.1858f)
                lineTo(38.7351f, 28.3494f)
                lineTo(38.5455f, 29.7377f)
                curveTo(38.5455f, 29.7377f, 38.3953f, 28.3525f, 38.3739f, 28.2741f)
                lineTo(37.2519f, 29.2371f)
                curveTo(37.2519f, 29.2371f, 38.0462f, 28.1771f, 38.1651f, 28.0351f)
                lineTo(36.6816f, 27.8846f)
                curveTo(36.6816f, 27.8846f, 38.0336f, 27.73f, 38.1594f, 27.7148f)
                lineTo(37.205f, 26.5836f)
                lineTo(38.3671f, 27.4663f)
                curveTo(38.3869f, 27.3447f, 38.5742f, 26.0128f, 38.5742f, 26.0128f)
                lineTo(38.84f, 27.4f)
                lineTo(39.8621f, 26.5653f)
                lineTo(39.035f, 27.6645f)
                lineTo(40.3996f, 27.8757f)
                close()
            }
        }
        .build()
        return _spiritOfCadeau!!
    }

private var _spiritOfCadeau: ImageVector? = null