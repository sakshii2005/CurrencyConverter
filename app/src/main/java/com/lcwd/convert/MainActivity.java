package com.lcwd.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.lcwd.convert.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    double fromValue = 0.0;
    String fromUnit = "";

    double toValue = 0.0;

    String toUnit = "";


    private List<String> units = Arrays.asList(
            "JPY", "CNY", "SDG", "RON", "MKD", "MXN", "CAD",
            "ZAR", "AUD", "NOK", "ILS", "ISK", "SYP", "LYD", "UYU", "YER", "CSD",
            "EEK", "THB", "IDR", "LBP", "AED", "BOB", "QAR", "BHD", "HNL", "HRK",
            "COP", "ALL", "DKK", "MYR", "SEK", "RSD", "BGN", "DOP", "KRW", "LVL",
            "VEF", "CZK", "TND", "KWD", "VND", "JOD", "NZD", "PAB", "CLP", "PEN",
            "GBP", "DZD", "CHF", "RUB", "UAH", "ARS", "SAR", "EGP", "INR", "PYG",
            "TWD", "TRY", "BAM", "OMR", "SGD", "MAD", "BYR", "NIO", "HKD", "LTL",
            "SKK", "GTQ", "BRL", "EUR", "HUF", "IQD", "CRC", "PHP", "SVC", "PLN",
            "USD"
    );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initComponents();

    }

    private void initComponents() {
        Collections.sort(units);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, units);
        binding.toUnit.setAdapter(arrayAdapter);
        binding.fromUnit.setAdapter(arrayAdapter);

        binding.convertButton.setOnClickListener(view -> {
//            get the values
            try {


                fromValue = Double.parseDouble(binding.fromValue.getText().toString());
                fromUnit = binding.fromUnit.getSelectedItem().toString();
                toUnit = binding.toUnit.getSelectedItem().toString();
                convertValue();


            } catch (Exception e) {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    //    contains the logic to convert the currencies
    private void convertValue() {

        try {

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("USD")) {
                toValue = fromValue / 84.36;
            } else if (fromUnit.equalsIgnoreCase("USD") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 84.36;
            }

            if (fromUnit.equalsIgnoreCase("USD") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue / 0.012;
            } else if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("USD")) {
                toValue = fromValue * 0.012;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("JPY")) {
                toValue = fromValue / 0.54;
            } else if (fromUnit.equalsIgnoreCase("JPY") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 0.54;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("CNY")) {
                toValue = fromValue / 11.61;
            } else if (fromUnit.equalsIgnoreCase("CNY") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 11.61;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("RON")) {
                toValue = fromValue / 17.90;
            } else if (fromUnit.equalsIgnoreCase("RON") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 17.90;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("THB")) {
                toValue = fromValue / 2.43;
            } else if (fromUnit.equalsIgnoreCase("THB") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 2.43;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("NZD")) {
                toValue = fromValue / 49.59;
            } else if (fromUnit.equalsIgnoreCase("NZD") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 49.49;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("SAR")) {
                toValue = fromValue / 22.47;
            } else if (fromUnit.equalsIgnoreCase("SAR") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 22.47;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("AED")) {
                toValue = fromValue / 22.96;
            } else if (fromUnit.equalsIgnoreCase("AED") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 22.96;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("VND")) {
                toValue = fromValue / 0.0033;
            } else if (fromUnit.equalsIgnoreCase("VND") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 0.0033;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("UAH")) {
                toValue = fromValue / 2.05;
            } else if (fromUnit.equalsIgnoreCase("UAH") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 2.05;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("COP")) {
                toValue = fromValue / 0.019;
            } else if (fromUnit.equalsIgnoreCase("COP") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 0.019;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("TWD")) {
                toValue = fromValue / 2.59;
            } else if (fromUnit.equalsIgnoreCase("TWD") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 2.59;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("EUR")) {
                toValue = fromValue / 88.98;
            } else if (fromUnit.equalsIgnoreCase("EUR") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 88.98;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("GBP")) {
                toValue = fromValue / 106.83;
            } else if (fromUnit.equalsIgnoreCase("GBP") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 106.83;
            }

        if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("LKR")) {
                toValue = fromValue / 0.29;
            } else if (fromUnit.equalsIgnoreCase("LKR") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 0.29;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("CAD")) {
                toValue = fromValue / 60.32;
            } else if (fromUnit.equalsIgnoreCase("CAD") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 60.32;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("CHF")) {
                toValue = fromValue / 95.31;
            } else if (fromUnit.equalsIgnoreCase("CHF") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 95.31;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("ZAR")) {
                toValue = fromValue / 4.65;
            } else if (fromUnit.equalsIgnoreCase("ZAR") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 4.65;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("GIP")) {
                toValue = fromValue / 106.80;
            } else if (fromUnit.equalsIgnoreCase("GIP") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 106.80;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("TRY")) {
                toValue = fromValue / 2.45;
            } else if (fromUnit.equalsIgnoreCase("TRY") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 2.45;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("PKR")) {
                toValue = fromValue / 0.30;
            } else if (fromUnit.equalsIgnoreCase("PKR") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 0.30;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("ILS")) {
                toValue = fromValue / 22.61;
            } else if (fromUnit.equalsIgnoreCase("ILS") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 22.61;
            }

            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("AFN")) {
                toValue = fromValue / 1.23;
            } else if (fromUnit.equalsIgnoreCase("AFN") && toUnit.equalsIgnoreCase("INR")) {
                toValue = fromValue * 1.23;
            }


            binding.toValue.setText(String.valueOf(toValue));
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }


}