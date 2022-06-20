package top.renjilin.design_mode.builder.demo1.builder.impl;

import top.renjilin.design_mode.builder.demo1.builder.iBuilder;
import top.renjilin.design_mode.builder.demo1.product.Computer;

public class ComputerBuilder implements iBuilder {
    Computer computer = new Computer();

    @Override
    public void buildCpu() {
        this.computer.setCpu("我是电脑的CPU");
    }

    @Override
    public void buildVideo() {
        this.computer.setVideo("我是电脑的音响");
    }

    @Override
    public void buildGraphics() {
        this.computer.setGraphics("我是电脑的显卡");
    }

    @Override
    public void buildMainboard() {
        this.computer.setMainboard("我是电脑的主板");
    }

    @Override
    public void buildPower() {
        this.computer.setPower("我是电脑的电源");
    }

    @Override
    public void buildMonitor() {
        this.computer.setMonitor("我是电脑的显示器");
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}
