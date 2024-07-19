class CardActivity {
    import android.os.Bundle
    import android.util.Log
    import androidx.appcompat.app.AppCompatActivity
    import androidx.recyclerview.widget.LinearLayoutManager
    import com.example.mycardapp.databinding.ActivityMainBinding
    import com.google.firebase.firestore.FirebaseFirestore

    class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding
        private lateinit var db: FirebaseFirestore
        private lateinit var cardAdapter: CardAdapter
        private val items = mutableListOf<CardItem>()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            // Initialize Firestore
            db = FirebaseFirestore.getInstance()

            // Set up RecyclerView
            binding.recyclerView.layoutManager = LinearLayoutManager(this)
            cardAdapter = CardAdapter(items)
            binding.recyclerView.adapter = cardAdapter

            // Fetch data from Firestore
            fetchData()
        }

        private fun fetchData() {
            db.collection("cards")
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        val name = document.getString("name") ?: ""
                        val address = document.getString("address") ?: ""
                        val cardItem = CardItem(name, address)
                        items.add(cardItem)
                    }
                    cardAdapter.notifyDataSetChanged()
                }
                .addOnFailureListener { exception ->
                    Log.w("MainActivity", "Error getting documents: ", exception)
                }
        }
    }
}