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

public val PaymentsGroup.AmazonPay: ImageVector
    get() {
        if (_amazonPay != null) {
            return _amazonPay!!
        }
        _amazonPay = Builder(name = "AmazonPay", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
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
            path(fill = SolidColor(Color(0xFF232F3E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.5368f, 21.5397f)
                horizontalLineTo(31.5692f)
                curveTo(31.4737f, 21.5345f, 31.3985f, 21.4548f, 31.3973f, 21.3573f)
                verticalLineTo(16.2735f)
                curveTo(31.4076f, 16.1769f, 31.4886f, 16.1045f, 31.5838f, 16.1069f)
                horizontalLineTo(32.4844f)
                curveTo(32.5664f, 16.1096f, 32.6366f, 16.1677f, 32.6562f, 16.2489f)
                verticalLineTo(17.0264f)
                horizontalLineTo(32.6751f)
                curveTo(32.9467f, 16.3313f, 33.3274f, 16.0f, 33.9977f, 16.0f)
                curveTo(34.4325f, 16.0f, 34.857f, 16.1604f, 35.1311f, 16.5987f)
                curveTo(35.3846f, 17.0054f, 35.3846f, 17.6899f, 35.3846f, 18.1817f)
                verticalLineTo(21.3801f)
                curveTo(35.3704f, 21.4734f, 35.2907f, 21.5416f, 35.1982f, 21.5397f)
                horizontalLineTo(34.222f)
                curveTo(34.1344f, 21.5358f, 34.062f, 21.4686f, 34.0501f, 21.3801f)
                verticalLineTo(18.6199f)
                curveTo(34.0501f, 18.5767f, 34.0505f, 18.5319f, 34.0509f, 18.4861f)
                curveTo(34.0555f, 17.9426f, 34.0615f, 17.2508f, 33.4425f, 17.2508f)
                curveTo(33.1933f, 17.2625f, 32.9737f, 17.4215f, 32.8805f, 17.6575f)
                curveTo(32.7448f, 17.9678f, 32.7267f, 18.2781f, 32.7267f, 18.6217f)
                verticalLineTo(21.3573f)
                curveTo(32.723f, 21.4605f, 32.6389f, 21.5416f, 32.5377f, 21.5397f)
                horizontalLineTo(32.5368f)
                close()
                moveTo(28.4378f, 16.007f)
                curveTo(29.8789f, 16.007f, 30.6583f, 17.2692f, 30.6583f, 18.8732f)
                curveTo(30.6583f, 20.4238f, 29.799f, 21.6536f, 28.4378f, 21.6536f)
                curveTo(27.0242f, 21.6536f, 26.2542f, 20.3914f, 26.2542f, 18.8198f)
                curveTo(26.2542f, 17.2482f, 27.0336f, 16.007f, 28.4378f, 16.007f)
                close()
                moveTo(28.4472f, 17.0448f)
                curveTo(27.7314f, 17.0448f, 27.6858f, 18.0388f, 27.6858f, 18.6594f)
                lineTo(27.6858f, 18.6799f)
                curveTo(27.6857f, 19.3087f, 27.6856f, 20.6052f, 28.4378f, 20.6052f)
                curveTo(29.1983f, 20.6052f, 29.2266f, 19.5359f, 29.2266f, 18.8838f)
                curveTo(29.2266f, 18.456f, 29.2086f, 17.9424f, 29.0814f, 17.5365f)
                curveTo(28.9723f, 17.1859f, 28.7549f, 17.0448f, 28.4472f, 17.0448f)
                close()
                moveTo(10.4983f, 21.5502f)
                horizontalLineTo(9.5281f)
                curveTo(9.4381f, 21.5454f, 9.365f, 21.4742f, 9.3562f, 21.3827f)
                verticalLineTo(16.2989f)
                curveTo(9.3595f, 16.197f, 9.4419f, 16.1164f, 9.5419f, 16.1175f)
                horizontalLineTo(10.4467f)
                curveTo(10.5394f, 16.1227f, 10.6135f, 16.1982f, 10.6186f, 16.2928f)
                verticalLineTo(16.9563f)
                horizontalLineTo(10.6366f)
                curveTo(10.8721f, 16.3138f, 11.3164f, 16.0149f, 11.9145f, 16.0149f)
                curveTo(12.5126f, 16.0149f, 12.9019f, 16.3138f, 13.1743f, 16.9563f)
                curveTo(13.3561f, 16.4618f, 13.7853f, 16.1059f, 14.2969f, 16.025f)
                curveTo(14.8085f, 15.9442f, 15.3231f, 16.1511f, 15.6431f, 16.5662f)
                curveTo(15.9071f, 16.9322f, 15.8986f, 17.442f, 15.8907f, 17.9208f)
                verticalLineTo(17.9209f)
                curveTo(15.8894f, 18.0016f, 15.888f, 18.0816f, 15.888f, 18.1597f)
                verticalLineTo(21.3669f)
                curveTo(15.8871f, 21.4166f, 15.8669f, 21.4639f, 15.8317f, 21.4983f)
                curveTo(15.7965f, 21.5326f, 15.7494f, 21.5513f, 15.7007f, 21.5502f)
                horizontalLineTo(14.7305f)
                curveTo(14.6351f, 21.5451f, 14.5599f, 21.4653f, 14.5586f, 21.3678f)
                verticalLineTo(18.6734f)
                curveTo(14.5586f, 18.6326f, 14.5593f, 18.58f, 14.5601f, 18.5203f)
                verticalLineTo(18.5203f)
                curveTo(14.5632f, 18.2674f, 14.568f, 17.886f, 14.5312f, 17.7215f)
                curveTo(14.459f, 17.3796f, 14.2416f, 17.2832f, 13.9606f, 17.2832f)
                curveTo(13.703f, 17.2913f, 13.4749f, 17.455f, 13.3805f, 17.6996f)
                curveTo(13.2879f, 17.9388f, 13.2887f, 18.324f, 13.2893f, 18.6094f)
                lineTo(13.2894f, 18.6734f)
                verticalLineTo(21.3669f)
                curveTo(13.2885f, 21.4165f, 13.2684f, 21.4636f, 13.2334f, 21.4979f)
                curveTo(13.1984f, 21.5323f, 13.1515f, 21.5511f, 13.1029f, 21.5502f)
                horizontalLineTo(12.1302f)
                curveTo(12.0349f, 21.5446f, 11.9599f, 21.4651f, 11.9583f, 21.3678f)
                verticalLineTo(18.6734f)
                curveTo(11.9583f, 18.6182f, 11.9591f, 18.5605f, 11.96f, 18.5012f)
                verticalLineTo(18.5012f)
                verticalLineTo(18.5012f)
                verticalLineTo(18.5012f)
                verticalLineTo(18.5012f)
                verticalLineTo(18.5012f)
                verticalLineTo(18.5011f)
                verticalLineTo(18.5011f)
                curveTo(11.9677f, 17.9515f, 11.9773f, 17.271f, 11.3568f, 17.271f)
                curveTo(10.6855f, 17.271f, 10.6861f, 18.0456f, 10.6865f, 18.6312f)
                lineTo(10.6865f, 18.6734f)
                verticalLineTo(21.3669f)
                curveTo(10.6856f, 21.4166f, 10.6653f, 21.4639f, 10.6301f, 21.4983f)
                curveTo(10.595f, 21.5326f, 10.5478f, 21.5513f, 10.4992f, 21.5502f)
                horizontalLineTo(10.4983f)
                close()
                moveTo(7.6101f, 21.6124f)
                curveTo(7.6838f, 21.6547f, 7.7756f, 21.6452f, 7.8395f, 21.5887f)
                lineTo(7.8472f, 21.5905f)
                curveTo(8.0406f, 21.4143f, 8.3929f, 21.1022f, 8.5914f, 20.9331f)
                curveTo(8.6671f, 20.8673f, 8.6533f, 20.7578f, 8.5914f, 20.6701f)
                curveTo(8.5725f, 20.6436f, 8.5535f, 20.6176f, 8.5347f, 20.5918f)
                lineTo(8.5346f, 20.5917f)
                curveTo(8.3755f, 20.3742f, 8.2245f, 20.1676f, 8.2245f, 19.7524f)
                verticalLineTo(18.2106f)
                curveTo(8.2245f, 18.1611f, 8.2247f, 18.112f, 8.225f, 18.0631f)
                verticalLineTo(18.063f)
                verticalLineTo(18.0629f)
                verticalLineTo(18.0628f)
                verticalLineTo(18.0626f)
                verticalLineTo(18.0625f)
                verticalLineTo(18.0624f)
                verticalLineTo(18.0623f)
                verticalLineTo(18.0621f)
                curveTo(8.2279f, 17.4667f, 8.2306f, 16.9219f, 7.7948f, 16.5058f)
                curveTo(7.4236f, 16.1411f, 6.8066f, 16.0131f, 6.334f, 16.0131f)
                curveTo(5.4102f, 16.0131f, 4.379f, 16.3646f, 4.1633f, 17.5287f)
                curveTo(4.1543f, 17.5758f, 4.1647f, 17.6246f, 4.192f, 17.6636f)
                curveTo(4.2193f, 17.7027f, 4.2611f, 17.7287f, 4.3076f, 17.7355f)
                lineTo(5.2409f, 17.8398f)
                curveTo(5.332f, 17.8257f, 5.4025f, 17.7509f, 5.4127f, 17.6575f)
                curveTo(5.4935f, 17.2569f, 5.8235f, 17.0632f, 6.1939f, 17.0632f)
                curveTo(6.395f, 17.0632f, 6.6201f, 17.1377f, 6.7387f, 17.32f)
                curveTo(6.8604f, 17.5031f, 6.8585f, 17.746f, 6.8568f, 17.9643f)
                curveTo(6.8566f, 17.9895f, 6.8564f, 18.0144f, 6.8564f, 18.0388f)
                verticalLineTo(18.1668f)
                curveTo(6.7682f, 18.1769f, 6.6757f, 18.1866f, 6.5804f, 18.1965f)
                curveTo(6.068f, 18.2498f, 5.4754f, 18.3115f, 5.0312f, 18.5104f)
                curveTo(4.4297f, 18.7786f, 4.0f, 19.3246f, 4.0f, 20.1284f)
                curveTo(4.0f, 21.1575f, 4.6359f, 21.672f, 5.4531f, 21.672f)
                curveTo(6.1432f, 21.672f, 6.5204f, 21.5063f, 7.0541f, 20.9523f)
                curveTo(7.0798f, 20.9906f, 7.103f, 21.0259f, 7.1249f, 21.0592f)
                lineTo(7.1249f, 21.0592f)
                curveTo(7.2522f, 21.2529f, 7.3351f, 21.379f, 7.6101f, 21.6124f)
                close()
                moveTo(6.8608f, 19.2228f)
                lineTo(6.8607f, 19.1748f)
                verticalLineTo(18.9618f)
                curveTo(6.1586f, 18.9618f, 5.417f, 19.1152f, 5.417f, 19.9584f)
                curveTo(5.417f, 20.3879f, 5.6345f, 20.6771f, 6.0065f, 20.6771f)
                curveTo(6.2798f, 20.6771f, 6.5247f, 20.5053f, 6.6794f, 20.2266f)
                curveTo(6.8614f, 19.8965f, 6.8611f, 19.5873f, 6.8608f, 19.2228f)
                close()
                moveTo(21.3147f, 20.6666f)
                curveTo(21.2958f, 20.64f, 21.2768f, 20.614f, 21.2579f, 20.5881f)
                curveTo(21.0988f, 20.3706f, 20.9478f, 20.1641f, 20.9478f, 19.7498f)
                verticalLineTo(18.2071f)
                curveTo(20.9478f, 18.1544f, 20.9481f, 18.102f, 20.9484f, 18.05f)
                lineTo(20.9484f, 18.0492f)
                curveTo(20.9518f, 17.4569f, 20.9548f, 16.9163f, 20.5181f, 16.5022f)
                curveTo(20.146f, 16.1376f, 19.529f, 16.0096f, 19.0573f, 16.0096f)
                curveTo(18.1335f, 16.0096f, 17.1023f, 16.3603f, 16.8857f, 17.5251f)
                curveTo(16.8765f, 17.5725f, 16.8869f, 17.6217f, 16.9144f, 17.661f)
                curveTo(16.9419f, 17.7003f, 16.984f, 17.7263f, 17.031f, 17.7329f)
                lineTo(17.9719f, 17.8363f)
                curveTo(18.0629f, 17.8219f, 18.1333f, 17.7473f, 18.1438f, 17.654f)
                curveTo(18.2254f, 17.2534f, 18.5537f, 17.0597f, 18.9241f, 17.0597f)
                curveTo(19.1243f, 17.0597f, 19.3537f, 17.1351f, 19.4689f, 17.3174f)
                curveTo(19.5914f, 17.4998f, 19.5896f, 17.7428f, 19.5879f, 17.9611f)
                curveTo(19.5877f, 17.9862f, 19.5875f, 18.011f, 19.5875f, 18.0353f)
                verticalLineTo(18.1606f)
                curveTo(19.501f, 18.1705f, 19.4105f, 18.1798f, 19.3173f, 18.1894f)
                curveTo(18.8034f, 18.2424f, 18.2074f, 18.3038f, 17.7622f, 18.5033f)
                curveTo(17.1538f, 18.7716f, 16.7268f, 19.3176f, 16.7268f, 20.1223f)
                curveTo(16.7268f, 21.1504f, 17.3627f, 21.665f, 18.1799f, 21.665f)
                curveTo(18.8674f, 21.665f, 19.2472f, 21.4993f, 19.78f, 20.9453f)
                curveTo(19.8052f, 20.9828f, 19.828f, 21.0174f, 19.8494f, 21.05f)
                lineTo(19.8495f, 21.0501f)
                lineTo(19.8497f, 21.0504f)
                lineTo(19.8498f, 21.0505f)
                curveTo(19.9789f, 21.2467f, 20.0607f, 21.371f, 20.3368f, 21.6054f)
                curveTo(20.4105f, 21.6474f, 20.502f, 21.6383f, 20.5663f, 21.5826f)
                curveTo(20.7596f, 21.4073f, 21.1119f, 21.0943f, 21.3104f, 20.9252f)
                curveTo(21.3938f, 20.8647f, 21.38f, 20.7578f, 21.3147f, 20.6666f)
                close()
                moveTo(19.407f, 20.2222f)
                curveTo(19.2532f, 20.5001f, 19.0074f, 20.6719f, 18.735f, 20.6719f)
                curveTo(18.3629f, 20.6719f, 18.1455f, 20.3826f, 18.1455f, 19.954f)
                curveTo(18.1455f, 19.1099f, 18.8871f, 18.9574f, 19.5892f, 18.9574f)
                verticalLineTo(19.1713f)
                lineTo(19.5892f, 19.2106f)
                curveTo(19.5894f, 19.5797f, 19.5896f, 19.8903f, 19.407f, 20.2222f)
                close()
                moveTo(22.1363f, 17.0054f)
                verticalLineTo(16.2814f)
                curveTo(22.134f, 16.2318f, 22.1524f, 16.1836f, 22.187f, 16.1487f)
                curveTo(22.2216f, 16.1137f, 22.269f, 16.0954f, 22.3176f, 16.0982f)
                horizontalLineTo(25.5083f)
                curveTo(25.5568f, 16.0965f, 25.6039f, 16.1151f, 25.6386f, 16.1497f)
                curveTo(25.6733f, 16.1843f, 25.6927f, 16.2319f, 25.6922f, 16.2814f)
                verticalLineTo(16.9046f)
                curveTo(25.6922f, 17.0089f, 25.6063f, 17.1456f, 25.4524f, 17.3612f)
                lineTo(23.7991f, 19.7682f)
                curveTo(24.4126f, 19.7533f, 25.0614f, 19.8471f, 25.6191f, 20.167f)
                curveTo(25.7221f, 20.223f, 25.7878f, 20.3311f, 25.791f, 20.4501f)
                verticalLineTo(21.2285f)
                curveTo(25.791f, 21.3354f, 25.6767f, 21.459f, 25.5556f, 21.395f)
                curveTo(24.4972f, 20.8401f, 23.2408f, 20.8424f, 22.1844f, 21.4011f)
                curveTo(22.0735f, 21.4616f, 21.9575f, 21.3398f, 21.9575f, 21.2328f)
                verticalLineTo(20.4922f)
                curveTo(21.9474f, 20.3176f, 21.9887f, 20.1439f, 22.0761f, 19.9934f)
                lineTo(23.9916f, 17.1886f)
                horizontalLineTo(22.321f)
                curveTo(22.2724f, 17.1905f, 22.2251f, 17.172f, 22.1901f, 17.1374f)
                curveTo(22.1552f, 17.1027f, 22.1358f, 17.055f, 22.1363f, 17.0054f)
                close()
                moveTo(39.0007f, 16.7442f)
                curveTo(39.2446f, 16.5248f, 39.5233f, 16.3493f, 39.8248f, 16.2253f)
                curveTo(40.1097f, 16.1094f, 40.4136f, 16.05f, 40.7202f, 16.05f)
                curveTo(41.0251f, 16.0442f, 41.3274f, 16.1064f, 41.6062f, 16.2323f)
                curveTo(41.8689f, 16.3551f, 42.099f, 16.5403f, 42.2774f, 16.7722f)
                curveTo(42.4715f, 17.0292f, 42.6151f, 17.3221f, 42.7001f, 17.6347f)
                curveTo(42.8032f, 18.0052f, 42.853f, 18.3891f, 42.848f, 18.7742f)
                curveTo(42.8526f, 19.1675f, 42.7993f, 19.5593f, 42.6898f, 19.9365f)
                curveTo(42.5982f, 20.2565f, 42.448f, 20.556f, 42.2473f, 20.8191f)
                curveTo(42.0609f, 21.0584f, 41.8242f, 21.2519f, 41.5547f, 21.3853f)
                curveTo(41.2715f, 21.5194f, 40.9619f, 21.5857f, 40.6498f, 21.5791f)
                curveTo(40.0664f, 21.5889f, 39.5017f, 21.3692f, 39.0729f, 20.9655f)
                verticalLineTo(23.3987f)
                curveTo(39.0811f, 23.456f, 39.0623f, 23.5138f, 39.0222f, 23.5547f)
                curveTo(38.9821f, 23.5956f, 38.9254f, 23.6148f, 38.8692f, 23.6065f)
                horizontalLineTo(38.2677f)
                curveTo(38.2116f, 23.6148f, 38.1549f, 23.5956f, 38.1148f, 23.5547f)
                curveTo(38.0746f, 23.5138f, 38.0558f, 23.456f, 38.064f, 23.3987f)
                verticalLineTo(16.412f)
                curveTo(38.0562f, 16.3548f, 38.0751f, 16.2972f, 38.1152f, 16.2564f)
                curveTo(38.1552f, 16.2156f, 38.2117f, 16.1963f, 38.2677f, 16.2042f)
                horizontalLineTo(38.7154f)
                curveTo(38.7738f, 16.1987f, 38.832f, 16.2177f, 38.8763f, 16.2569f)
                curveTo(38.9206f, 16.2962f, 38.9472f, 16.3522f, 38.95f, 16.412f)
                lineTo(39.0007f, 16.7442f)
                close()
                moveTo(40.4358f, 16.8792f)
                curveTo(39.9424f, 16.8831f, 39.4637f, 17.0508f, 39.072f, 17.3569f)
                verticalLineTo(20.2494f)
                curveTo(39.5063f, 20.5825f, 39.954f, 20.7487f, 40.4152f, 20.7481f)
                curveTo(41.3513f, 20.7481f, 41.8193f, 20.1053f, 41.8193f, 18.8198f)
                curveTo(41.8193f, 17.5342f, 41.3582f, 16.887f, 40.4358f, 16.8783f)
                verticalLineTo(16.8792f)
                close()
                moveTo(44.1189f, 17.1351f)
                lineTo(44.1954f, 17.1088f)
                curveTo(44.6794f, 16.9567f, 45.1825f, 16.877f, 45.6889f, 16.8721f)
                curveTo(46.0962f, 16.8727f, 46.3813f, 16.949f, 46.544f, 17.1009f)
                curveTo(46.7067f, 17.2528f, 46.788f, 17.5158f, 46.788f, 17.8898f)
                verticalLineTo(18.5717f)
                curveTo(46.3689f, 18.462f, 45.9385f, 18.4032f, 45.5059f, 18.3964f)
                curveTo(44.9089f, 18.3958f, 44.434f, 18.5463f, 44.0811f, 18.8478f)
                curveTo(43.7282f, 19.1493f, 43.5518f, 19.5525f, 43.5518f, 20.0574f)
                curveTo(43.5529f, 20.5278f, 43.6961f, 20.9033f, 43.9814f, 21.1837f)
                curveTo(44.2667f, 21.4642f, 44.6534f, 21.6045f, 45.1415f, 21.6045f)
                curveTo(45.4433f, 21.6032f, 45.7422f, 21.5437f, 46.0223f, 21.4292f)
                curveTo(46.3178f, 21.3115f, 46.5913f, 21.1431f, 46.831f, 20.9313f)
                lineTo(46.8825f, 21.274f)
                curveTo(46.8851f, 21.331f, 46.9105f, 21.3843f, 46.9527f, 21.4216f)
                curveTo(46.995f, 21.4589f, 47.0504f, 21.4768f, 47.106f, 21.4712f)
                horizontalLineTo(47.5442f)
                curveTo(47.6003f, 21.4792f, 47.6567f, 21.4599f, 47.6968f, 21.4191f)
                curveTo(47.7368f, 21.3783f, 47.7557f, 21.3207f, 47.7479f, 21.2635f)
                verticalLineTo(17.7171f)
                curveTo(47.7473f, 17.1491f, 47.5943f, 16.7304f, 47.289f, 16.4611f)
                curveTo(46.9836f, 16.1917f, 46.5087f, 16.057f, 45.8642f, 16.057f)
                curveTo(45.5435f, 16.057f, 45.2234f, 16.0863f, 44.9078f, 16.1446f)
                curveTo(44.6323f, 16.1895f, 44.3627f, 16.2663f, 44.1043f, 16.3734f)
                curveTo(44.0418f, 16.395f, 43.9858f, 16.4327f, 43.9419f, 16.483f)
                curveTo(43.9085f, 16.5447f, 43.8941f, 16.6153f, 43.9006f, 16.6854f)
                verticalLineTo(16.9633f)
                curveTo(43.9006f, 17.0886f, 43.947f, 17.1509f, 44.033f, 17.1509f)
                curveTo(44.0623f, 17.1504f, 44.0913f, 17.1451f, 44.1189f, 17.1351f)
                close()
                moveTo(46.0885f, 20.6929f)
                curveTo(45.8638f, 20.7785f, 45.6263f, 20.8239f, 45.3864f, 20.827f)
                curveTo(45.1218f, 20.8276f, 44.9181f, 20.7569f, 44.7754f, 20.6149f)
                curveTo(44.6328f, 20.4729f, 44.5615f, 20.2704f, 44.5615f, 20.0075f)
                curveTo(44.5609f, 19.405f, 44.9444f, 19.1038f, 45.7121f, 19.1038f)
                curveTo(45.894f, 19.1041f, 46.0757f, 19.1164f, 46.2561f, 19.1406f)
                curveTo(46.4358f, 19.1637f, 46.6142f, 19.1964f, 46.7906f, 19.2387f)
                verticalLineTo(20.2985f)
                curveTo(46.5774f, 20.4653f, 46.3407f, 20.5983f, 46.0885f, 20.6929f)
                close()
                moveTo(50.423f, 23.4189f)
                curveTo(50.6636f, 23.2109f, 50.8759f, 22.8681f, 51.0598f, 22.3907f)
                lineTo(53.2992f, 16.5776f)
                curveTo(53.3362f, 16.4989f, 53.3603f, 16.4145f, 53.3705f, 16.3278f)
                curveTo(53.3705f, 16.2454f, 53.3232f, 16.2034f, 53.2279f, 16.2034f)
                horizontalLineTo(52.6581f)
                curveTo(52.5799f, 16.1957f, 52.5013f, 16.2138f, 52.4338f, 16.2551f)
                curveTo(52.3764f, 16.3205f, 52.3348f, 16.3989f, 52.3127f, 16.4838f)
                lineTo(50.9377f, 20.5115f)
                lineTo(49.5121f, 16.4838f)
                curveTo(49.4899f, 16.3989f, 49.4484f, 16.3205f, 49.3909f, 16.2551f)
                curveTo(49.3235f, 16.2138f, 49.2449f, 16.1957f, 49.1666f, 16.2034f)
                horizontalLineTo(48.5557f)
                curveTo(48.4611f, 16.2034f, 48.4139f, 16.2454f, 48.4139f, 16.3278f)
                curveTo(48.4237f, 16.4145f, 48.4475f, 16.4989f, 48.4843f, 16.5776f)
                lineTo(50.4453f, 21.5221f)
                lineTo(50.252f, 22.048f)
                curveTo(50.1368f, 22.3805f, 50.0079f, 22.609f, 49.8653f, 22.7334f)
                curveTo(49.6935f, 22.8677f, 49.4798f, 22.934f, 49.2638f, 22.9201f)
                curveTo(49.1719f, 22.9221f, 49.0801f, 22.9151f, 48.9896f, 22.8991f)
                curveTo(48.9393f, 22.8881f, 48.8881f, 22.8813f, 48.8367f, 22.8789f)
                curveTo(48.7344f, 22.8789f, 48.6837f, 22.9447f, 48.6837f, 23.0762f)
                verticalLineTo(23.3461f)
                curveTo(48.678f, 23.4205f, 48.6958f, 23.4948f, 48.7344f, 23.5582f)
                curveTo(48.7767f, 23.6086f, 48.8341f, 23.6434f, 48.8977f, 23.6573f)
                curveTo(49.0869f, 23.7082f, 49.282f, 23.7327f, 49.4777f, 23.73f)
                curveTo(49.8673f, 23.7306f, 50.1824f, 23.6269f, 50.423f, 23.4189f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF9900)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.732f, 24.7828f)
                curveTo(23.9529f, 24.2227f, 24.4444f, 22.9675f, 24.2107f, 22.6633f)
                horizontalLineTo(24.2124f)
                curveTo(23.9797f, 22.3585f, 22.6735f, 22.5185f, 22.086f, 22.5904f)
                lineTo(22.0847f, 22.5906f)
                curveTo(21.906f, 22.6125f, 21.8785f, 22.4539f, 22.0392f, 22.339f)
                curveTo(23.0824f, 21.5914f, 24.7916f, 21.8052f, 24.9901f, 22.0577f)
                curveTo(25.1886f, 22.3101f, 24.936f, 24.0579f, 23.9589f, 24.8923f)
                curveTo(23.8085f, 25.0203f, 23.665f, 24.9519f, 23.732f, 24.7828f)
                close()
                moveTo(16.7121f, 25.647f)
                curveTo(18.9842f, 25.647f, 21.6301f, 24.9151f, 23.4528f, 23.5434f)
                verticalLineTo(23.546f)
                curveTo(23.7544f, 23.3146f, 23.4957f, 22.9745f, 23.1881f, 23.1077f)
                curveTo(21.1986f, 23.9637f, 19.063f, 24.4105f, 16.9038f, 24.4225f)
                curveTo(13.9081f, 24.4225f, 11.0105f, 23.5846f, 8.6662f, 22.1935f)
                curveTo(8.4608f, 22.0717f, 8.3078f, 22.2864f, 8.4797f, 22.4433f)
                curveTo(10.7366f, 24.5203f, 13.6725f, 25.6628f, 16.7121f, 25.647f)
                close()
            }
        }
        .build()
        return _amazonPay!!
    }

private var _amazonPay: ImageVector? = null