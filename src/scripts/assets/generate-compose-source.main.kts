@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://jetbrains.bintray.com/trove4j")

@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.8.1")

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import java.io.File

val assetsDir = File(".temp-compose-assets")
val srcDir = File("build/assets/compose")

Svg2Compose.parse(
    applicationIconPackage = "com.decathlon.vitamin.compose",
    accessorName = "VitaminAssets",
    outputSourceDirectory = srcDir,
    vectorsDirectory = assetsDir,
    type = VectorType.SVG
)
