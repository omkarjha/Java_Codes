public class OTP {
    public static void main(String[] args) {

        OTPGenerator otpGenerator = new RandomOTPGenerator();

        // Generate and print the OTP
        String otp = otpGenerator.generateOTP();
        System.out.println("Your request for OTP is successful. The OTP is " + otp);
    }
}