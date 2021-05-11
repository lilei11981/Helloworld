package com.company.zoo.abc.demo19;

/**
 * @author lilei
 * @date 2020-08-13 13:39
 * @apiNote
 */

public class Device {
    private String name;
    private Destination destination;
    private DeviceController deviceController;

    public void control(Destination destination) {
        destination.todo();
    }
}
