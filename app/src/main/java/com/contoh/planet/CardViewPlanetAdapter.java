package com.contoh.planet;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class CardViewPlanetAdapter extends RecyclerView.Adapter<CardViewPlanetAdapter.CardViewViewHolder> {
    private Context context;
    LayoutInflater layoutInflater;
    public CardViewPlanetAdapter(Context context) {
        this.context = context;
        layoutInflater = layoutInflater.from(context);
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.item_cardview_planet, viewGroup, false);
        CardViewViewHolder holder = new CardViewViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder cardViewViewHolder, final int position) {
        cardViewViewHolder.imgPhoto.setImageResource(dataimg[position]);
        cardViewViewHolder.tvName.setText(name[position]);
        cardViewViewHolder.tvRemarks.setText(remarks[position]);
        cardViewViewHolder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idetail = new Intent(context, Main2Activity.class);
                idetail.putExtra("tvName", name[position]);
                idetail.putExtra("tvRemarks", remarks[position]);
                idetail.putExtra("imgPhoto", dataimg[position]);
                idetail.putExtra("tvDesc", desc[position]);
                idetail.putExtra("tvDesc2", desc2[position]);
                context.startActivity(idetail);

            }
        });
        cardViewViewHolder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idetail = new Intent(context, Main2Activity.class);
                idetail.putExtra("tvName", name[position]);
                idetail.putExtra("tvRemarks", remarks[position]);
                idetail.putExtra("imgPhoto", dataimg[position]);
                idetail.putExtra("tvDesc", desc[position]);
                idetail.putExtra("tvDesc2", desc2[position]);
                context.startActivity(idetail);

            }
        });

        cardViewViewHolder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Favorite", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnDetail, btnFavorite;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
        }
    }

    String [] name = new String[] {
            "Merkurius", "Venus", "Bumi", "Mars", "Jupiter", "Saturnus", "Uranus", "Neptunus"
    };
    String [] remarks = new String[]{
            "Planet terdekat dengan matahari", "Planet yang tidak memiliki satelit dan tidak memiliki cincin", "Planet yang dihuni oleh makhluk hidup",
            "Planet Merah karena warnanya yang kemerah-merahan", "Planet yang memiliki satelit alam paling banyak", "Planet yang memiliki cincin",
            "Planet ini disebut Giants Ice karena komposisinya dilapisi oleh lapisan es", "Planet ini sering disebut Blue Planet atau Planet Biru"
    };
    String [] desc = new String[]{
            "Planet Merkurius adalah planet terkecil dalam tata surya, dengan diameter planet sebesar 4879,4 kilometer. Merkurius memiliki waktu rotasi 59 hari dan waktu revolusi 88 hari. Hal ini membuat Merkurius menjadi planet dengan waktu revolusi tercepat dalam tata surya.",
            "Planet Venus memiliki diameter sebesar 4879,4 kilometer. Venus memiliki waktu rotasi 243 hari dan waktu revolusi 225 hari. Artinya 1 hari di Venus lebih lama dari waktu 1 tahunnya. Venus juga memiliki waktu rotasi 1 hari paling lama.",
            "Planet Bumi memiliki diameter sebesar 12.742 kilometer. Jarak bumi dengan matahari sekitar 150 juta kilometer. Bumi memiliki waktu rotasi 24 jam dan waktu revolusi 365 hari. Komposisi planet Bumi terbuat dari nitrogen (78%), oksigen (21%) dan gas lainnya.",
            "Planet Mars memiliki diameter sebesar 6704 kilometer. Mars memiliki waktu rotasi 25 jam dan waktu revolusi 687 hari. Saat ini, ilmuwan banyak melakukan penelitian untuk meneliti struktur planet Mars dan apakah memungkinkan adanya kehidupan di planet ini.",
            "Jupiter memiliki waktu rotasi 10 jam dan waktu revolusi 11 tahun. Meski ukurannya besar, namun Jupiter menjadi planet dengan waktu rotasi tercepat dimana 1 hari di Jupiter hanya berlangsung 10 jam. Komposisi Jupiter terbesar terdiri dari gas hidrogen (89%) dan helium (10%).",
            "Planet Saturnus memiliki diameter sebesar 120.536 kilometer. Saturnus memiliki waktu rotasi 11 jam dan waktu revolusi 29 tahun. Waktu rotasi Saturnus menjadi yang tercepat kedua setelah Jupiter. Sekitar 96% komposisi Saturnus adalah gas hidrogen.",
            "Planet Uranus memiliki diameter sebesar 50.724 kilometer. Uranus memiliki waktu rotasi 17 jam dan waktu revolusi 84 tahun. Dengan rata-rata suhu 76 Kelvin, planet Uranus menjadi planet terdingin kedua setelah planet Neptunus.",
            "Planet Neptunus memiliki diameter sebesar 49.530 kilometer. Neptunus memiliki waktu rotasi 16 jam dan waktu revolusi 165 tahun. Komposisi planet Neptunus kebanyakan adalah lapisan es. Planet ini juga sering disebut Blue Planet atau Planet Biru."

    };
    String [] desc2 = new String[]{
            "Jarak planet dari matahari : 57 juta kilometer\n" +
                    "Waktu rotasi   : 59 hari\n" +
                    "Waktu revolusi : 88 hari\n" +
                    "Luas permukaan : 7,48 x 107 km2\n" +
                    "Diameter   : 4879,4 km\n" +
                    "Volume : 6,083 x 1010 km3\n" +
                    "Massa  : 3,3011 x 1023 kg\n" +
                    "Gravitasi  : 3.7 m/s2\n" +
                    "Rata-rata suhu : 340 Kelvin\n" +
                    "Jumlah Satelit : tidak ada\n",
            "Jarak planet dari matahari : 108 juta kilometer\n" +
                    "Waktu rotasi : 243 hari\n" +
                    "Waktu revolusi : 225 hari\n" +
                    "Luas permukaan : 4,6023 x 108 km2\n" +
                    "Diameter : 12103,6 km\n" +
                    "Volume : 9,2843 x 1011 km3\n" +
                    "Massa : 4,8675 x 1024 kg\n" +
                    "Gravitasi : 8,87 m/s2\n" +
                    "Rata-rata suhu : 737 Kelvin\n" +
                    "Jumlah Satelit : tidak ada\n",
            "Jarak planet dari matahari : 150 juta kilometer\n" +
                    "Waktu rotasi : 24 jam\n" +
                    "Waktu revolusi : 365 hari\n" +
                    "Luas permukaan : 510 juta km2\n" +
                    "Diameter : 12742 km\n" +
                    "Volume : 1083,21 x 1012 km3\n" +
                    "Massa : 5972,37 x 1024 kg\n" +
                    "Gravitasi : 9,8 m/s2\n" +
                    "Rata-rata suhu : 288 Kelvin\n" +
                    "Jumlah Satelit : 1\n",
            "Jarak planet dari matahari : 230 juta kilometer\n" +
                    "Waktu rotasi : 25 jam\n" +
                    "Waktu revolusi : 687 hari\n" +
                    "Luas permukaan : 145 juta km2\n" +
                    "Diameter : 6794 km\n" +
                    "Volume : 1,6318 x 1011 km3\n" +
                    "Massa : 6,417 x 1023 kg\n" +
                    "Gravitasi : 3,7 m/s2\n" +
                    "Rata-rata suhu : 210 Kelvin\n" +
                    "Jumlah Satelit : 2\n",
            "Jarak planet dari matahari : 778 juta kilometer\n" +
                    "Waktu rotasi : 10 jam\n" +
                    "Waktu revolusi : 11 tahun\n" +
                    "Luas permukaan : 6,142 x 1010 km2\n" +
                    "Diameter : 142984 km\n" +
                    "Volume : 1,43 x 1015 km3\n" +
                    "Massa : 1,898 x 1027 kg\n" +
                    "Gravitasi : 24,8 m/s2\n" +
                    "Rata-rata suhu : 165 Kelvin\n" +
                    "Jumlah Satelit : 79\n",
            "Jarak planet dari matahari : 1,4 miliar kilometer\n" +
                    "Waktu rotasi : 11 jam\n" +
                    "Waktu revolusi : 29 tahun\n" +
                    "Luas permukaan : 4,27 x 1010 km2\n" +
                    "Diameter : 120536 km\n" +
                    "Volume : 8,271 x 1014 km3\n" +
                    "Massa : 5,683 x 1026 kg\n" +
                    "Gravitasi : 10,44 m/s2\n" +
                    "Rata-rata suhu : 134 Kelvin\n" +
                    "Jumlah Satelit : 62\n",
            "Jarak planet dari matahari : 3 miliar kilometer\n" +
                    "Waktu rotasi : 17 jam\n" +
                    "Waktu revolusi : 84 tahun\n" +
                    "Luas permukaan : 8,116 x 109 km2\n" +
                    "Diameter : 50724 km\n" +
                    "Volume : 6,83 x 1013 km3\n" +
                    "Massa : (8.6810 ± 0.0013) x 1025 kg\n" +
                    "Gravitasi : 8,69 m/s2\n" +
                    "Rata-rata suhu : 76 Kelvin\n" +
                    "Jumlah Satelit : 27\n",
            "Jarak planet dari matahari : 4,5 miliar kilometer\n" +
                    "Waktu rotasi : 16 jam\n" +
                    "Waktu revolusi : 165 tahun\n" +
                    "Luas permukaan : 7,168 x 1013 km2\n" +
                    "Diameter : 49530 km\n" +
                    "Volume : 6,254 x 1013 km3\n" +
                    "Massa : 1,024 x 1026 kg\n" +
                    "Gravitasi : 11,15 m/s2\n" +
                    "Rata-rata suhu : 72 Kelvin\n" +
                    "Jumlah Satelit : 14\n"
    };
    int []dataimg = new int[]{
            R.drawable.merkurius, R.drawable.venus, R.drawable.bumi, R.drawable.mars,
            R.drawable.jupiter, R.drawable.saturnus, R.drawable.uranus, R.drawable.neptunus
    };


}
