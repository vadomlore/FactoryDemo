package com.zyl.beginning.inheritence.paints;

public class RenderingFactory {
    RenderConfig config;

    //Action action;
    doRender getDoRender(){
        if(config.render.equals("dx")) return new DxRender(config.screenHeight, config.screenWidth)::render;
        if(config.render.equals("openGL")) return new OpenGLRender(config.screenHeight, config.screenWidth)::render;
        if(config.render.equals("openGL")) return new OpenGLEx3Render(config.screenHeight, config.screenWidth)::exRender;
        return ()->{};
    }

    void render(){
        assert config != null;
        getRenderTypeByOsName();
        getDoRender().render();
    }

    private void getRenderTypeByOsName() {
        String os = System.getProperty("os.name");
        if(os.toLowerCase().startsWith("win")) { //windows
           config.render = "dx";
        }
        else{
            config.render = "openGL";
        }
    }

    void setConfig(RenderConfig config){
        this.config = config;
    }

    public static class DxRender {
        public int height;
        public int width;

        public DxRender(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public void render(){
            System.out.println("render with dx" + width +","  + height);
        }
    }

    public static class OpenGLRender {

        public int height;
        public int width;

        public OpenGLRender(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public void render(){
            System.out.println("render with openGL" + width + "," + height);
        }
    }

    public static class OpenGLEx1Render extends OpenGLRender {

        public OpenGLEx1Render(int height, int width) {
            super(height, width);
        }
    }

    public static class OpenGLEx2Render extends OpenGLRender{

        public OpenGLEx2Render(int height, int width) {
            super(height, width);
        }
    }

    public static class OpenGLEx3Render extends OpenGLRender{

        public OpenGLEx3Render(int height, int width) {
            super(height, width);
        }

        @Override
        public void render() {
            System.out.println("OpenGLEx3Render render.");
        }

        public void exRender() {
            render();
            System.out.println("OpenGLEx3Render render.");
        }
    }

//    public static void main(String[] args) {
//        Rendering rendering =  new OpenGLRender(1,2);
//        rendering.doRender();
//        rendering = new OpenGLEx3Render(1, 2);
//        rendering.doRender();
//    }
}
