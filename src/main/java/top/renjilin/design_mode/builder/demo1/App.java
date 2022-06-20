package top.renjilin.design_mode.builder.demo1;

import top.renjilin.design_mode.builder.demo1.builder.iBuilder;
import top.renjilin.design_mode.builder.demo1.builder.impl.ComputerBuilder;
import top.renjilin.design_mode.builder.demo1.product.Computer;
import top.renjilin.design_mode.builder.demo1.director.Director;

public class App {
    public static void main(String[] args) {
        iBuilder builder = new ComputerBuilder();
        Director director = new Director(builder);

        Computer computer = director.construct();
        System.out.println(computer);
    }
}
