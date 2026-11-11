package org.firstinspires.ftc.teamcode; 

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TuffMech { // assume battery is on back
    private DcMotor motor0; // LF
    private DcMotor motor1; // RF
    private DcMotor motor2; // LB
    private DcMotor motor3; // RB

    public void init(HardwareMap hwMap) {
        motor0 = hwMap.get(DcMotor.class, "motor0");
        motor1 = hwMap.get(DcMotor.class, "motor1");
        motor2 = hwMap.get(DcMotor.class, "motor2");
        motor3 = hwMap.get(DcMotor.class, "motor3");

     
        motor0.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor3.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor4.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setMotorSpeed(double speed) {
        motor0.setPower(-speed); 
        motor1.setPower(-speed);
        motor2.setPower(speed);
        motor3.setPower(speed);
    }
    
    public void setSpeed0(double speed) {
         motor0.setPower(-speed); 
    }
    public void setSpeed1(double speed) {
         motor1.setPower(-speed);
    }
    public void setSpeed2(double speed) {
         motor2.setPower(speed);
    }
    public void setSpeed3(double speed) {
         motor3.setPower(speed);
    }
    
    public void setMotorSpeedLeft(double speed) {
        motor0.setPower(-speed);
        motor1.setPower(-speed);
    }
    public void setMotorSpeedRight(double speed) {
        motor2.setPower(speed);
        motor3.setPower(speed);
    }


}
