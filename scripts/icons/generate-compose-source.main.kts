@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://jetbrains.bintray.com/trove4j")

@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.8.1")

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import java.io.File

val iconsDir = File(".temp-compose-icons")
val srcDir = File("icons/compose")

Svg2Compose.parse(
    applicationIconPackage = "com.decathlon.vitamin.compose",
    accessorName = "VitaminIcons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = iconsDir,
    type = VectorType.SVG
)
