
/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */
package com.example.android.justjava;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
 int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
       if(quantity>=0&&quantity<100)
        quantity++;
        display1(quantity);

    }
    public void decrement(View view) {
        if(quantity>0&&quantity<=100)
        quantity--;
        display1(quantity);

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
       // int price=quantity*5;
        EditText Text=(EditText)findViewById(R.id.nameField);
        String value=Text.getText().toString();
        CheckBox whippedCream = (CheckBox)findViewById(R.id.checkBoxWippedCream);
        CheckBox IceCream = (CheckBox)findViewById(R.id.checkBoxIceCream);
        boolean HWC = whippedCream.isChecked();
        boolean HIC = IceCream.isChecked();
        String message ="Name:"+value+"\ntotal :$" + calculatePrice(quantity,HIC,HWC) +"\nQuantity :"+quantity+ "\n Thank You";
         //displayprice(quantity*5);
        Intent intent=new Intent( Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mail to:"));
        intent.putExtra(intent.EXTRA_SUBJECT,"Just Java for "+value);
        intent.putExtra(intent.EXTRA_TEXT,message);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
         //displayMessage(message,HWC,HIC);

    }
    private int calculatePrice(int quantityOfCoffee,boolean IceCream,boolean WCream) {
        int wc = 2, ic = 4, price = 0;
        if (IceCream)
            return price = (quantityOfCoffee * (5 + ic));
        else if (WCream)
            return price = (quantityOfCoffee * (5 + wc));
        else if (IceCream && WCream)
            return price = quantityOfCoffee * (ic + wc + 5);
        else
            return price = quantityOfCoffee * 5;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }
   /* private void displayprice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }*/
    private void displayMessage (String message,boolean WhippedCream,boolean IceCream){
        TextView priceTextView=(TextView)findViewById(R.id.price_text_view);
        message+="\nWhippedCream:" +WhippedCream;
        message+="\nIceCream:" +IceCream;
        priceTextView.setText(message);
    }
}