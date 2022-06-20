package top.renjilin.design_mode.builder.demo1.product;

import lombok.Data;

@Data
public class Computer {
    /**
     * cpu
     */
    private String cpu;

    /**
     * 音响
     */
    private String video;

    /**
     * 显卡
     */
    private String graphics;

    /**
     * 主板
     */
    private String mainboard;

    /**
     * 电源
     */
    private String power;

    /**
     * 显示器
     */
    private String monitor;
}
