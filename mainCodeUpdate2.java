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
    boolean fan = false;
    @Override
    public void loop() {
        
        double PowerY = -gamepad1.left_stick_y/1.5;
        double PowerX = gamepad1.right_stick_x/1.5;
        double Power4 = (gamepad1.right_trigger-gamepad1.left_trigger)/10;
        
        
        if (gamepad1.a) {
            fan = true;
        } else if (gamepad1.b) {
            fan = false;
        }
        if (fan) {
            robot.setMotor4(0.2);
        }
        
    
    
        
        if (gamepad1.x) {
            PowerY = 0;
            PowerX = 0;
            Power4 = 0;
            }
            
        robot.setMotorSpeedRight(PowerY - PowerX);
        robot.setMotorSpeedLeft(PowerY+PowerX);
        if (fan == false) {
            robot.setMotor4(Power4);
        }
    }
}
