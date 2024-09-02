package com.example.to_do.Home.Tasks

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.to_do.models.CardDate
import com.example.to_do.databinding.FragmentTasksBinding
import java.time.LocalDate
import java.time.ZoneId
import java.util.Date

class TasksFragment : Fragment() {
    private lateinit var viewBinding: FragmentTasksBinding
    private lateinit var dateListRecyclerViewAdapter: DateListRecyclerViewAdapter

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentTasksBinding.inflate(inflater)
        initDateRecyclerView()
        return viewBinding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initDateRecyclerView() {
        dateListRecyclerViewAdapter = DateListRecyclerViewAdapter(createListOfDates())
        viewBinding.rvDateList.adapter = dateListRecyclerViewAdapter
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createListOfDates(): MutableList<CardDate> {
        val dateList = mutableListOf<CardDate>()
        for (i in 0..365) {
            val dateTime = LocalDate.now().plusDays(i.toLong())
            dateList.add(
                CardDate(
                    month = dateTime.month.name.format("MM"),
                    dayNumber = dateTime.dayOfMonth.toString(),
                    dayName = dateTime.dayOfWeek.name.format("dd"),
                    dateTime = Date.from(dateTime.atStartOfDay(ZoneId.systemDefault()).toInstant()),
                    isSelected = false,)
            )
        }
        dateList[0].isSelected = true
        return dateList
    }


}