import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.awt.*;

/**
 * Counter that displays some taxt and a number.
 * 
 * @author Michael Kolling
 * @version 1.1
 */
public class Label extends Actor
{
    private int value = 0;
    private int stringLength = 20; //used to store the string length
    private int testImageWidth = 10; //default = 2
    private String text;
    private String initialText;
    private String key;//used to store a keystroke

    private boolean editable;
    private boolean isTextfield;

    /**
     * Create a counter without a text prefix, initialized to zero.
     */
    public Label()
    {
        this("", false, false);
    }

    /**
     * Create a counter with a given text prefix, initialized to zero.
     */
    public Label(String prefix, boolean editable, boolean isTextfield)
    {
        initialText = prefix;
        text = initialText;
        int imageWidth= (text.length() + testImageWidth) * 10;
        setImage(new GreenfootImage(imageWidth, 16));
        updateImage();
        this.editable = editable;
        this.isTextfield = isTextfield;
    }

    /**
     * Listen for keystrokes.
     */

    public void act()
    {
        if (editable){
            key = Greenfoot.getKey();//get most recent keystroke
            if (key == "backspace") { //delete character
                stringLength = text.length();
                if (stringLength > initialText.length()) {
                    text = text.substring(0, stringLength - 1);
                    updateImage();
                }
            }
            else if (key == "space") {
                text += " ";
                updateImage();
            }
            //Does so the arrow keys won't show up on label
            else if (key!=null) {
                if(key != "up" && key != "down" && key != "left" && key != "right")
                {
                    text += key; 
                    updateImage();
                }
            }

        }
    }

    /**
     * Show the current text and count on this actor's image.
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();  
        image.setFont(new Font("Verdana", Font.BOLD, 18));
        image.drawString(text, 1, 12);
    }

    public String getText()
    {
        return text;
    }
}