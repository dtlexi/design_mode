package top.renjilin.design_mode.builder.demo1.director;

import top.renjilin.design_mode.builder.demo1.builder.iBuilder;
import top.renjilin.design_mode.builder.demo1.product.Computer;

public class Director {
    private iBuilder builder;

    public Director(iBuilder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Computer construct() {
        builder.buildCpu();
        builder.buildVideo();
        builder.buildGraphics();
        builder.buildMainboard();
        builder.buildPower();
        builder.buildMonitor();

        return builder.build();
    }
}
