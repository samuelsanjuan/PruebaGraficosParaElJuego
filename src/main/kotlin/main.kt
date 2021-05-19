import java.awt.Color
import java.awt.Graphics
import java.awt.Toolkit
import java.awt.image.BufferedImage
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel

val ventana =JFrame("Graficos")
val icono1= ImageIcon("src/main/resources/googleSingIn.png")
val icono2= ImageIcon("src/main/resources/Captura.PNG")

fun main() {

    val screenSize = Toolkit.getDefaultToolkit().screenSize
    val width = screenSize.width
    val height = screenSize.height

    ventana.defaultCloseOperation=JFrame.EXIT_ON_CLOSE
    ventana.setSize(width, height)

    val posicionI2X=32
    val posicionI2Y=64

    val imagen1=iconToBufferedImage(icono1)
    val imagen2=iconToBufferedImage(icono2)

    for (x in 0 until imagen2.width) {
        for (y in 0 until imagen2.height){

            setPixel(x+posicionI2X, y+posicionI2Y, getPixel(x,y,imagen2), imagen1)
        }
    }
    ventana.add(JLabel(ImageIcon(imagen1)))
    ventana.isVisible = true
}

fun setPixel(x: Int, y: Int, c: Color,imagen:BufferedImage) = imagen.setRGB(x, y, c.rgb)

fun getPixel(x: Int, y: Int,imagen: BufferedImage) = Color(imagen.getRGB(x, y))

fun iconToBufferedImage(icon :ImageIcon):BufferedImage{

    val bi = BufferedImage(icon.iconWidth,icon.iconHeight,BufferedImage.TYPE_INT_RGB)
    val g: Graphics = bi.createGraphics()

    icon.paintIcon(null, g, 0, 0)
    g.dispose()

    return bi
}
/*
 fun fill(c: Color) {
        val g = image.graphics
        g.color = c
        g.fillRect(0, 0, image.width, image.height)
    }


 */