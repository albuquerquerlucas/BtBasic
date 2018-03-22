package br.com.prot.btbasic;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int ENABLE_BLUETOOTH = 1;
    public static int SELECT_PAIRED_DEVICE = 2;
    public static int SELECT_DISCOVERED_DEVICE = 3;

    private TextView txtStatusMessage;

    private BluetoothAdapter btAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btAdapter = BluetoothAdapter.getDefaultAdapter();
        initUi();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(this.btAdapter == null)
            this.txtStatusMessage.setText(Msg.SUPORTE_BLUETOOTH);
    }

    private void initUi(){
        this.txtStatusMessage = (TextView) findViewById(R.id.txt_status_message);
    }
}
