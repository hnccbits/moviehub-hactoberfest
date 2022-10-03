package com.nipunapps.tmdb.homepage.data.remote.dto.trending

import com.nipunapps.tmdb.homepage.data.remote.dto.upcoming.Result

data class TrendingMovieDto(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)