package com.company.zoo.abc.demo19;

/**
 * @author lilei
 * @date 2020-08-13 13:40
 * @apiNote
 */

public class DeviceController {
    private Device name;
    private Destination destination;

    public static void main(String[] args) {
        new DeviceController().control(new Destination());
    }

    public void control(Destination destination) {
        destination.todo();
    }
}
