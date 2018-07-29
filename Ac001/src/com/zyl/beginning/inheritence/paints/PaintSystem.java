package com.zyl.beginning.inheritence.paints;

import com.zyl.beginning.BasicTypes;

public class PaintSystem {

    public PaintSystem(Brush brush, ColorSelector colorSelector, Paper paper, RenderingFactory rendering) {
        this.brush = brush;
        this.colorSelector = colorSelector;
        this.paper = paper;
        this.rendering = rendering;
    }

    public PaintSystem(Brush brush, ColorSelector colorSelector, Paper paper, Rendering render) {
        this.brush = brush;
        this.colorSelector = colorSelector;
        this.paper = paper;
        this.rendering = rendering;
    }

    public void setXXXParam(){

    }

    Brush brush;

    ColorSelector colorSelector;

    Paper paper;

    RenderingFactory rendering;

    public void rendering(){
        rendering.render();
    }

    public void paint(){
        BasicTypes.Color color = colorSelector.selectColor();
        brush.setColor(color);
        paper.paint(brush);
        rendering();
    }

    public static void main(String[] args) {
        RenderingFactory factory = new RenderingFactory();
        RenderConfig config = new RenderConfig();
        config.setScreenHeight(300);
        config.setScreenWidth(500);
        factory.setConfig(config);
        new PaintSystem(new Brush(), new ColorSelector(), new Paper(), factory).paint();
//        new PaintSystem(new Brush(), new ColorSelector(), new Paper(), new RenderingFactory.OpenGLRender(1,2)).paint();
//        new PaintSystem(new Brush(), new ColorSelector(), new Paper(), new RenderingFactory.OpenGLEx1Render(1,2)).paint();
    }
}
