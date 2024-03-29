package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Io: ImageVector
    get() {
        if (_io != null) {
            return _io!!
        }
        _io = Builder(name = "Io", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0085f, 0.003f)
                    horizontalLineTo(14.0085f)
                    horizontalLineTo(0.0085f)
                    verticalLineTo(20.003f)
                    horizontalLineTo(28.0085f)
                    verticalLineTo(0.003f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF07319C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(28.0134f, 0.0f)
                    horizontalLineTo(0.0134f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0134f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 9.9705f)
                    lineTo(0.0121f, 10.9614f)
                    lineTo(2.266f, 10.1742f)
                    curveTo(2.4695f, 10.1063f, 2.8891f, 10.1057f, 3.0944f, 10.1742f)
                    lineTo(5.8444f, 11.0908f)
                    curveTo(6.3209f, 11.2497f, 7.0364f, 11.2507f, 7.516f, 11.0908f)
                    lineTo(10.266f, 10.1742f)
                    curveTo(10.4695f, 10.1063f, 10.8891f, 10.1057f, 11.0944f, 10.1742f)
                    lineTo(13.8444f, 11.0908f)
                    curveTo(14.3209f, 11.2497f, 15.0364f, 11.2507f, 15.516f, 11.0908f)
                    lineTo(18.266f, 10.1742f)
                    curveTo(18.4695f, 10.1063f, 18.8891f, 10.1057f, 19.0944f, 10.1742f)
                    lineTo(21.8444f, 11.0908f)
                    curveTo(22.3209f, 11.2497f, 23.0364f, 11.2507f, 23.516f, 11.0908f)
                    lineTo(26.266f, 10.1742f)
                    curveTo(26.4695f, 10.1063f, 26.8891f, 10.1057f, 27.0944f, 10.1742f)
                    lineTo(28.0137f, 10.5204f)
                    verticalLineTo(9.088f)
                    lineTo(27.516f, 8.9092f)
                    curveTo(27.0364f, 8.7494f, 26.3209f, 8.7504f, 25.8444f, 8.9092f)
                    lineTo(23.0944f, 9.8259f)
                    curveTo(22.8891f, 9.8944f, 22.4695f, 9.8938f, 22.266f, 9.8259f)
                    lineTo(19.516f, 8.9092f)
                    curveTo(19.0364f, 8.7494f, 18.3209f, 8.7504f, 17.8444f, 8.9092f)
                    lineTo(15.0944f, 9.8259f)
                    curveTo(14.8891f, 9.8944f, 14.4695f, 9.8938f, 14.266f, 9.8259f)
                    lineTo(14.0137f, 9.7509f)
                    verticalLineTo(10.0092f)
                    lineTo(0.0f, 9.9705f)
                    close()
                    moveTo(13.9985f, 7.7954f)
                    curveTo(14.4751f, 7.9543f, 15.0364f, 7.9174f, 15.516f, 7.7575f)
                    lineTo(18.266f, 6.8408f)
                    curveTo(18.4695f, 6.773f, 18.8891f, 6.7724f, 19.0944f, 6.8408f)
                    lineTo(21.8444f, 7.7575f)
                    curveTo(22.3209f, 7.9163f, 23.0364f, 7.9174f, 23.516f, 7.7575f)
                    lineTo(26.266f, 6.8408f)
                    curveTo(26.4695f, 6.773f, 26.8891f, 6.7724f, 27.0944f, 6.8408f)
                    lineTo(28.0084f, 7.2139f)
                    lineTo(28.0123f, 5.753f)
                    lineTo(27.516f, 5.5759f)
                    curveTo(27.0364f, 5.416f, 26.3209f, 5.417f, 25.8444f, 5.5759f)
                    lineTo(23.0944f, 6.4926f)
                    curveTo(22.8891f, 6.561f, 22.4695f, 6.5604f, 22.266f, 6.4926f)
                    lineTo(19.516f, 5.5759f)
                    curveTo(19.0364f, 5.416f, 18.3209f, 5.417f, 17.8444f, 5.5759f)
                    lineTo(15.0944f, 6.4926f)
                    curveTo(14.8891f, 6.561f, 14.4695f, 6.5604f, 14.266f, 6.4926f)
                    lineTo(13.9985f, 6.4064f)
                    verticalLineTo(7.7954f)
                    close()
                    moveTo(14.011f, 4.4612f)
                    curveTo(14.4876f, 4.6201f, 15.0364f, 4.584f, 15.516f, 4.4241f)
                    lineTo(18.266f, 3.5075f)
                    curveTo(18.4695f, 3.4397f, 18.8891f, 3.439f, 19.0944f, 3.5075f)
                    lineTo(21.8444f, 4.4241f)
                    curveTo(22.3209f, 4.583f, 23.0364f, 4.584f, 23.516f, 4.4241f)
                    lineTo(26.266f, 3.5075f)
                    curveTo(26.4695f, 3.4397f, 26.8891f, 3.439f, 27.0944f, 3.5075f)
                    lineTo(28.0044f, 3.9034f)
                    lineTo(28.016f, 2.4453f)
                    lineTo(27.516f, 2.2426f)
                    curveTo(27.0364f, 2.0827f, 26.3209f, 2.0837f, 25.8444f, 2.2426f)
                    lineTo(23.0944f, 3.1592f)
                    curveTo(22.8891f, 3.2277f, 22.4695f, 3.2271f, 22.266f, 3.1592f)
                    lineTo(19.516f, 2.2426f)
                    curveTo(19.0364f, 2.0827f, 18.3209f, 2.0837f, 17.8444f, 2.2426f)
                    lineTo(15.0944f, 3.1592f)
                    curveTo(14.8891f, 3.2277f, 14.4695f, 3.2271f, 14.266f, 3.1592f)
                    lineTo(14.0071f, 3.0628f)
                    lineTo(14.011f, 4.4612f)
                    close()
                    moveTo(14.0106f, 1.1371f)
                    curveTo(14.4763f, 1.2473f, 15.0893f, 1.233f, 15.516f, 1.0908f)
                    lineTo(18.266f, 0.1742f)
                    curveTo(18.4695f, 0.1063f, 18.8891f, 0.1057f, 19.0944f, 0.1742f)
                    lineTo(21.8444f, 1.0908f)
                    curveTo(22.3209f, 1.2497f, 23.0364f, 1.2507f, 23.516f, 1.0908f)
                    lineTo(26.266f, 0.1742f)
                    curveTo(26.4695f, 0.1063f, 26.8891f, 0.1057f, 27.0944f, 0.1742f)
                    lineTo(28.0164f, 0.5315f)
                    lineTo(28.0085f, 0.003f)
                    lineTo(14.0193f, 0.003f)
                    lineTo(14.0085f, 0.003f)
                    lineTo(0.0134f, 0.0f)
                    lineTo(14.0034f, 0.0f)
                    curveTo(14.0034f, 0.8465f, 14.0106f, 1.1371f, 14.0106f, 1.1371f)
                    close()
                    moveTo(28.0047f, 19.1103f)
                    lineTo(28.0134f, 20.0f)
                    curveTo(28.0085f, 20.003f, 0.0134f, 20.0f, 0.0134f, 20.0f)
                    lineTo(0.0123f, 19.5577f)
                    lineTo(1.8444f, 18.9092f)
                    curveTo(2.321f, 18.7504f, 3.0364f, 18.7494f, 3.516f, 18.9092f)
                    lineTo(6.266f, 19.8259f)
                    curveTo(6.4695f, 19.8937f, 6.8891f, 19.8943f, 7.0944f, 19.8259f)
                    lineTo(9.8444f, 18.9092f)
                    curveTo(10.3209f, 18.7504f, 11.0364f, 18.7494f, 11.516f, 18.9092f)
                    lineTo(14.266f, 19.8259f)
                    curveTo(14.4695f, 19.8937f, 14.8891f, 19.8943f, 15.0944f, 19.8259f)
                    lineTo(17.8444f, 18.9092f)
                    curveTo(18.3209f, 18.7504f, 19.0364f, 18.7494f, 19.516f, 18.9092f)
                    lineTo(22.266f, 19.8259f)
                    curveTo(22.4695f, 19.8937f, 22.8891f, 19.8943f, 23.0944f, 19.8259f)
                    lineTo(25.8444f, 18.9092f)
                    curveTo(26.3209f, 18.7504f, 27.0364f, 18.7494f, 27.516f, 18.9092f)
                    lineTo(28.0047f, 19.1103f)
                    close()
                    moveTo(28.0171f, 15.7775f)
                    verticalLineTo(17.1828f)
                    lineTo(27.0944f, 16.8408f)
                    curveTo(26.8891f, 16.7724f, 26.4695f, 16.773f, 26.266f, 16.8408f)
                    lineTo(23.516f, 17.7575f)
                    curveTo(23.0364f, 17.9174f, 22.3209f, 17.9163f, 21.8444f, 17.7575f)
                    lineTo(19.0944f, 16.8408f)
                    curveTo(18.8891f, 16.7724f, 18.4695f, 16.773f, 18.266f, 16.8408f)
                    lineTo(15.516f, 17.7575f)
                    curveTo(15.0364f, 17.9174f, 14.3209f, 17.9163f, 13.8444f, 17.7575f)
                    lineTo(11.0944f, 16.8408f)
                    curveTo(10.8891f, 16.7724f, 10.4695f, 16.773f, 10.266f, 16.8408f)
                    lineTo(7.516f, 17.7575f)
                    curveTo(7.0364f, 17.9174f, 6.3209f, 17.9163f, 5.8444f, 17.7575f)
                    lineTo(3.0944f, 16.8408f)
                    curveTo(2.8891f, 16.7724f, 2.4695f, 16.773f, 2.266f, 16.8408f)
                    lineTo(0.004f, 17.6085f)
                    lineTo(0.008f, 16.1394f)
                    lineTo(1.8444f, 15.5759f)
                    curveTo(2.321f, 15.417f, 3.0364f, 15.416f, 3.516f, 15.5759f)
                    lineTo(6.266f, 16.4926f)
                    curveTo(6.4695f, 16.5604f, 6.8891f, 16.561f, 7.0944f, 16.4926f)
                    lineTo(9.8444f, 15.5759f)
                    curveTo(10.3209f, 15.417f, 11.0364f, 15.416f, 11.516f, 15.5759f)
                    lineTo(14.266f, 16.4926f)
                    curveTo(14.4695f, 16.5604f, 14.8891f, 16.561f, 15.0944f, 16.4926f)
                    lineTo(17.8444f, 15.5759f)
                    curveTo(18.3209f, 15.417f, 19.0364f, 15.416f, 19.516f, 15.5759f)
                    lineTo(22.266f, 16.4926f)
                    curveTo(22.4695f, 16.5604f, 22.8891f, 16.561f, 23.0944f, 16.4926f)
                    lineTo(25.8444f, 15.5759f)
                    curveTo(26.3209f, 15.417f, 27.0364f, 15.416f, 27.516f, 15.5759f)
                    lineTo(28.0171f, 15.7775f)
                    close()
                    moveTo(28.0171f, 12.4509f)
                    verticalLineTo(13.8375f)
                    lineTo(27.0944f, 13.5075f)
                    curveTo(26.8891f, 13.439f, 26.4695f, 13.4397f, 26.266f, 13.5075f)
                    lineTo(23.516f, 14.4241f)
                    curveTo(23.0364f, 14.584f, 22.3209f, 14.583f, 21.8444f, 14.4241f)
                    lineTo(19.0944f, 13.5075f)
                    curveTo(18.8891f, 13.439f, 18.4695f, 13.4397f, 18.266f, 13.5075f)
                    lineTo(15.516f, 14.4241f)
                    curveTo(15.0364f, 14.584f, 14.3209f, 14.583f, 13.8444f, 14.4241f)
                    lineTo(11.0944f, 13.5075f)
                    curveTo(10.8891f, 13.439f, 10.4695f, 13.4397f, 10.266f, 13.5075f)
                    lineTo(7.516f, 14.4241f)
                    curveTo(7.0364f, 14.584f, 6.3209f, 14.583f, 5.8444f, 14.4241f)
                    lineTo(3.0944f, 13.5075f)
                    curveTo(2.8891f, 13.439f, 2.4695f, 13.4397f, 2.266f, 13.5075f)
                    lineTo(0.008f, 14.2408f)
                    lineTo(0.0f, 12.8479f)
                    lineTo(1.8444f, 12.2426f)
                    curveTo(2.321f, 12.0837f, 3.0364f, 12.0827f, 3.516f, 12.2426f)
                    lineTo(6.266f, 13.1592f)
                    curveTo(6.4695f, 13.2271f, 6.8891f, 13.2277f, 7.0944f, 13.1592f)
                    lineTo(9.8444f, 12.2426f)
                    curveTo(10.3209f, 12.0837f, 11.0364f, 12.0827f, 11.516f, 12.2426f)
                    lineTo(14.266f, 13.1592f)
                    curveTo(14.4695f, 13.2271f, 14.8891f, 13.2277f, 15.0944f, 13.1592f)
                    lineTo(17.8444f, 12.2426f)
                    curveTo(18.3209f, 12.0837f, 19.0364f, 12.0827f, 19.516f, 12.2426f)
                    lineTo(22.266f, 13.1592f)
                    curveTo(22.4695f, 13.2271f, 22.8891f, 13.2277f, 23.0944f, 13.1592f)
                    lineTo(25.8444f, 12.2426f)
                    curveTo(26.3209f, 12.0837f, 27.0364f, 12.0827f, 27.516f, 12.2426f)
                    lineTo(28.0171f, 12.4509f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0006f, 0.9475f)
                    lineTo(11.4314f, 3.1023f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(6.67f)
                    horizontalLineTo(11.4319f)
                    lineTo(14.0006f, 8.8238f)
                    verticalLineTo(10.0026f)
                    horizontalLineTo(10.8044f)
                    lineTo(8.7864f, 8.3129f)
                    verticalLineTo(10.0026f)
                    horizontalLineTo(5.215f)
                    verticalLineTo(8.3114f)
                    lineTo(3.1932f, 10.0026f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.8136f)
                    lineTo(2.5635f, 6.67f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.1023f)
                    horizontalLineTo(2.5671f)
                    lineTo(0.0f, 0.952f)
                    verticalLineTo(0.0026f)
                    horizontalLineTo(3.4735f)
                    lineTo(5.215f, 1.4602f)
                    verticalLineTo(0.0026f)
                    horizontalLineTo(8.7864f)
                    verticalLineTo(1.463f)
                    lineTo(10.5352f, 0.0026f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(0.9475f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFDC1F37)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.6828f, 4.1023f)
                    lineTo(13.571f, 0.0026f)
                    lineTo(12.0943f, 0.0f)
                    lineTo(7.7864f, 3.601f)
                    verticalLineTo(0.0045f)
                    lineTo(6.215f, 0.0045f)
                    verticalLineTo(3.6011f)
                    lineTo(1.9281f, 0.0131f)
                    lineTo(0.4262f, 0.0045f)
                    lineTo(5.3183f, 4.1023f)
                    horizontalLineTo(6.0E-4f)
                    verticalLineTo(5.67f)
                    horizontalLineTo(5.3183f)
                    lineTo(0.139f, 10.0008f)
                    lineTo(1.6391f, 9.9989f)
                    lineTo(6.215f, 6.171f)
                    verticalLineTo(10.0004f)
                    horizontalLineTo(7.7864f)
                    verticalLineTo(6.1713f)
                    lineTo(12.36f, 10.0008f)
                    lineTo(13.8503f, 10.0028f)
                    lineTo(8.6829f, 5.67f)
                    horizontalLineTo(14.0006f)
                    verticalLineTo(4.1023f)
                    horizontalLineTo(8.6828f)
                    close()
                }
            }
        }
        .build()
        return _io!!
    }

private var _io: ImageVector? = null
