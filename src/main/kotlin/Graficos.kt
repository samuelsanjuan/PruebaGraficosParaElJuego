import java.awt.Color
import java.awt.Graphics
import java.awt.image.BufferedImage
import javax.swing.ImageIcon

class Graficos {

    fun dibujar(icono1:ImageIcon,icono2:ImageIcon,posicionI2X:Int,posicionI2Y:Int):ImageIcon{

        val imagen1=iconToBufferedImage(icono1)
        val imagen2=iconToBufferedImage(icono2)


    for (x in 0 until imagen2.width) {
        for (y in 0 until imagen2.height){

            setPixel(x+posicionI2X, y+posicionI2Y, getPixel(x,y,imagen2), imagen1)
        }
    }
        return ImageIcon(imagen1)
}

    fun setPixel(x: Int, y: Int, c: Color, imagen: BufferedImage) = imagen.setRGB(x, y, c.rgb)

    fun getPixel(x: Int, y: Int,imagen: BufferedImage) = Color(imagen.getRGB(x, y))

    fun iconToBufferedImage(icon : ImageIcon): BufferedImage {

        val bi = BufferedImage(icon.iconWidth,icon.iconHeight, BufferedImage.TYPE_INT_RGB)
        val g: Graphics = bi.createGraphics()

        icon.paintIcon(null, g, 0, 0)
        g.dispose()

        return bi
    }
}