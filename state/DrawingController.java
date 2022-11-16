package state;

/**
 * Você define o STATE no começo, e dependendo da seleção o objeto apresenta características diferentes
 */

public class DrawingController {

    private Tool tool;

    void defineQualEstado(Tool tool){
        this.tool = tool;
    }

    void mousePressed(){
        tool.handleMousePress();
    }

    void processKeyboard(){
        tool.handleMouseRelease();
    }

    void initialize(){
        tool.active();
    }


}
