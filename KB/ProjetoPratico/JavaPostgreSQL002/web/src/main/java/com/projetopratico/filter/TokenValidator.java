package com.projetopratico.filter;

public class TokenValidator {
    public boolean validate(String token, String[] errorMessage) {
        try {
            // Load the pvalidtoken class dynamically
            Class<?> pvalidtokenClass = Class.forName("com.projetopratico.pvalidtoken");

            // Create an instance of the pvalidtoken class
            Object pvalidtokenInstance = pvalidtokenClass
                    .getDeclaredConstructor(int.class)
                    .newInstance(-1);

            // Prepare parameters for the executeUdp method
            String[] error = new String[1]; // To capture the error message
            boolean[] isValid = new boolean[1]; // To capture the validation result

            // Invoke the executeUdp method
            pvalidtokenClass
                .getMethod("execute", String.class, String[].class, boolean[].class)
                .invoke(pvalidtokenInstance, token, error, isValid);

            // Set the error message
            if (errorMessage != null && error.length > 0) {
                errorMessage[0] = error[0];
            }

            // Return the validation result
            return isValid[0];

        } catch (Exception e) {
            e.printStackTrace();
            if (errorMessage != null) {
                errorMessage[0] = "Internal Server Error";
            }
            return false;
        }
    }
}
