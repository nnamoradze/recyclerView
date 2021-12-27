package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var personRecyclerViewAdapter: PersonRecyclerViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        recyclerView = findViewById(R.id.recyclerView)
        personRecyclerViewAdapter = PersonRecyclerViewAdapter(getData())

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = personRecyclerViewAdapter


    }

    private fun getData(): List<Person> {

        val list = ArrayList<Person>()

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        list.add(
            Person(
                1,
                "Alfie",
                "https://www.cnet.com/a/img/resize/b9cb3466480927557fb89f3558e9b92acd390508/hub/2021/08/20/257caf0a-f3a2-45db-9c70-d6ed50a85e6f/2021-toyota-camry-trd-ogi-1.jpg?auto=webp&fit=crop&height=675&width=1200",
                "alfie abalaki"
            )
        )

        list.add(
            Person(
                2,
                "giorgi",
                "https://platform.cstatic-images.com/large/in/v2/stock_photos/c1f63fc6-8ea7-4bb9-b990-f363dc93d340/e4488e00-ebf1-47c5-a2e5-f4687850f047.png",
                "giorgi namoradze"
            )
        )

        list.add(
            Person(
                3,
                "nika",
                "https://m.media-amazon.com/images/I/71RyMcAwIJL._AC_SL1500_.jpg",
                "nika namoradze"
            )
        )

        return list

    }

}