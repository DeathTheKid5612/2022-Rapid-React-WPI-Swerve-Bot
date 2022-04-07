// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.geometry.Translation2d;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  //Drivetrain Characteristics
  public static final double TRACK_WIDTH          = 1;
  public static final double WHEEL_BASE           = 1;
  public static final double WHEEL_DIAMETER       = 0.10033;
  public static final double WHEEL_CIRCUMFERENCE  = WHEEL_DIAMETER * Math.PI;

  public static final double DRIVE_GEAR_RATIO = (14.0 / 50.0) * (28.0 / 16.0) * (15.0 / 45.0); //0.16333 6.12:1
  public static final double ANGLE_GEAR_RATIO = (15.0 / 32.0) * (10.0 / 60.0); //0.0781 12.8:1

  //Swerve Drive Kinematics AKA wheel positions
  public static final SwerveDriveKinematics SWERVE_KINEMATICS = new SwerveDriveKinematics(
    new Translation2d(  WHEEL_BASE / 2.0,   TRACK_WIDTH / 2.0),
    new Translation2d(  WHEEL_BASE / 2.0,  -TRACK_WIDTH / 2.0),
    new Translation2d( -WHEEL_BASE / 2.0,   TRACK_WIDTH / 2.0),
    new Translation2d( -WHEEL_BASE / 2.0,  -TRACK_WIDTH / 2.0)
  );

  //Steer Motor PID
  public static final double ANGLE_kP = 0.6;   
  public static final double ANGLE_kI = 0.0;   
  public static final double ANGLE_kD = 12.0;  
  public static final double ANGLE_kF = 0.0;   

  //Drive Motor PID 
  public static final double DRIVE_kP = 0.1;   
  public static final double DRIVE_kI = 0.0;   
  public static final double DRIVE_kD = 0.0;   
  public static final double DRIVE_kF = 0.0;   

  //Swerve Max Values 
  public static final double MAX_SPEED            = 4.5;  //m/s
  public static final double MAX_ANGULAR_VELOCITY = 11.5; //m/s

  //Current Limits
  public static final int ANGLE_CONTINUOUS_CL = 25;
  public static final int ANGLE_PEAK_CL       = 40;
  public static final double ANGLE_PEAK_CURRENT_DURATION = 0.1;
  public static final boolean ANGLE_ENABLE_CURRENT_LIMIT = true;

  public static final int DRIVE_CONTINUOUS_CL = 35;
  public static final int DRIVE_PEAK_CL       = 60;
  public static final double DRIVE_PEAK_CURRENT_DURATION = 0.1;
  public static final boolean DRIVE_ENABLE_CURRENT_LIMIT = true;

  //Drive feed forward values
  public static final double FF_kS    = (0.632 / 12);     // 0.632 --- divide by 12 to convert from volts to percent output for CTRE
  public static final double FF_kV    = (0.0514 / 12);    // 0.0514
  public static final double FF_kA    = (0.00337 / 12);   // 0.27

  public static final int DRIVETRAIN_PIGEON_ID = 35;

  //Constants for swerve modules
  public static final class FrontLeftSwerveModule {
    public static final int DRIVE_MOTOR_ID = 46;
    public static final int STEER_MOTOR_ID = 42;
    public static final int STEER_ENCODER_ID = 32;
    public static final double STEER_OFFSET = 58.1726;
  }

  public static final class FrontRightSwerveModule {
    public static final int DRIVE_MOTOR_ID = 45;
    public static final int STEER_MOTOR_ID = 41;
    public static final int STEER_ENCODER_ID = 30;
    public static final double STEER_OFFSET = 341.9769;
  }

  public static final class BackLeftSwerveModule {
    public static final int DRIVE_MOTOR_ID = 40;
    public static final int STEER_MOTOR_ID = 44;
    public static final int STEER_ENCODER_ID = 33;
    public static final double STEER_OFFSET = 202.0523;
  }

  public static final class BackRightSwerveModule {
    public static final int DRIVE_MOTOR_ID = 47;
    public static final int STEER_MOTOR_ID = 43;
    public static final int STEER_ENCODER_ID = 31;
    public static final double STEER_OFFSET = 29.70428;
  }

  //Additional motor IDs
  public static final int SHOOTER_CONVEYOR_BOTTOM = 48;
  public static final int SHOOTER_CONVEYOR_TOP = 49;
  public static final int SHOOTER_FLYWHEEL = 50;

  public static final int CLIMBER_1 = 51;
  public static final int CLIMBER_2 = 52;

  public static final int TOF_SENSOR = 10;
}
