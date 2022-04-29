/*
        Arş. Gör. Ömer Ayberk ŞENCAN
        Gazi Üniversitesi Teknoloji Fakültesi
        Bilgisayar Mühendisliği Bölümü
        BMT-342 Mobil Programlama Dersi
        Laboratuvar Vize Sorusu

        Android projenizin, MainActivity sınıfının XML kısmında, ID'leri;

        1) "userNameTxt, passwdTxt" olan iki TextView,
        2) "userNameEdt, passwdEdt" olan iki EditText
        3) "connectBtn" olan bir buton olduğunu varsayınız.

        İkinci aktivite olan "welcomePage" sınıfında ise, ID'leri

        1) "profilePic" olan bir ImageView
        2) "gosterBtn" olan bir Button bulunmaktadır.

        Bu bileşenler ile ana sayfada kullanıcıdan, username ve şifre bilgisi aldıktan sonra, bu bilgilerin

        1) Username : gaziKullanici
        2) Password : gazi1926

        olması halinde, kullanıcıya bir Toast mesajı vererek ikinci sayfaya geçen. İkinci sayfada ise butona basılması halinde daha önceden ImageView'e atanmış olan kullanıcının profil
        fotoğrafını göstermek için, ilgili imageView'i görünmez konumdan görünür hale geçiren Java Kodlarını (Sadece Java kodlarını) "MainActivity" ve "welcomePage" activity'leri için
        ayrı ayrı yazınız. Ayrıca, kullanıcının ilk sayfada girmiş olduğu editText, ikinci sayfada manuel olarak yazmadan, ilk sayfadan çekilerek kullanıcıya gösterilebilir mi? Tartışınız.
*/
package com.gazi.mobilvizesorusu;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username = "gaziKullanici";
    String passwd = "gazi1926";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button connectBtn = findViewById(R.id.connectBtn);
        EditText userName = findViewById(R.id.userNameEdt);
        EditText password = findViewById(R.id.passwdEdt);

        connectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userName.getText().toString().equals(username) && password.getText().toString().equals(passwd)){

                    Intent gecis = new Intent(MainActivity.this, welcomePage.class);
                    startActivity(gecis);
                    //Hello world
                }
                else{
                    Toast.makeText(MainActivity.this, "Lütfen bilgilerinizi kontrol ediniz!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}