import java.awt.Color
import java.awt.Graphics
import java.awt.Image
import java.awt.Toolkit
import java.awt.image.BufferedImage
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel

val ventana =JFrame("Graficos")
val icono2= ImageIcon("src/main/resources/Captura.PNG")
var icono1=  ImageIcon("src/main/resources/googleSingIn.png")

val graficos:Graficos=Graficos()

var label =JLabel()

val screenSize = Toolkit.getDefaultToolkit().screenSize
val width = screenSize.width
val height = screenSize.height
fun main() {

    ventana.defaultCloseOperation=JFrame.EXIT_ON_CLOSE
    ventana.setSize(width, height)

    var posicionI2X=32
    var posicionI2Y=64

    while (true){

        imagenFinal=icono1
    imagenFinal=graficos.dibujar(imagenFinal,icono2,posicionI2X,posicionI2Y)


    ventana.remove(label)
    label= JLabel(imagenFinal)
    ventana.add(label)
    ventana.isVisible=true


        posicionI2X++

        println("($posicionI2X, $posicionI2Y)")
    }
}


/*
 fun fill(c: Color) {
        val g = image.graphics
        g.color = c
        g.fillRect(0, 0, image.width, image.height)
    }


 */