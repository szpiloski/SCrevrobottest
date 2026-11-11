package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode; 
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "tuff")
public class tuff extends OpMode { 

   
    TuffMech robot = new TuffMech();

    @Override
    public void init() {
       
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
    
        double PowerY = -gamepad1.left_stick_y/1.5;
        double PowerX = gamepad1.left_stick_x/1.5;
        double Power4 = gamepad1.right_stick_y;
        robot.setMotorSpeedRight(PowerY - PowerX);
        robot.setMotorSpeedLeft(PowerY+PowerX);

        }
    }
}
