package top.renjilin.design_mode.builder.demo1.builder;

import top.renjilin.design_mode.builder.demo1.product.Computer;

public interface iBuilder {
    void buildCpu();

    void buildVideo();

    void buildGraphics();

    void buildMainboard();

    void buildPower();

    void buildMonitor();

    Computer build();
}
