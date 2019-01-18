package org.themoviedb.android

data class State(
    val currentPage: Int,
    val persons: List<String>, // The list of persons
    val loadingNextPage: Boolean,
    val errorLoadingNextPage: Throwable?
)

val initialState = State(
    currentPage = 0,
    persons = emptyList(),
    loadingNextPage = false,
    errorLoadingNextPage = null
)

sealed class Action {
    object LoadNextPageAction : Action() // Action to load the first page. Triggered by the user.
    data class PageLoadedAction(val personsLoaded : List<String>, val page : Int) : Action() // Persons has been loaded
    object LoadPageAction : Action() // Started loading the list of persons
    data class ErrorLoadingNextPageAction(val error : Throwable) : Action() // An error occurred while loading
}

