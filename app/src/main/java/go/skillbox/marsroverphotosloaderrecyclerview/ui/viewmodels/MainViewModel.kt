package go.skillbox.marsroverphotosloaderrecyclerview.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import go.skillbox.domain.models.entity.MarsPhoto
import go.skillbox.domain.models.params.GetPhotosByPageParam
import go.skillbox.domain.usecases.GetPhotosByPageUseCase
import go.skillbox.marsroverphotosloaderrecyclerview.ui.recyclerviews.pagingsources.PhotosPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    companion object {
        private const val PAGE_SIZE = 1
    }

    @Inject
    lateinit var getPhotosByPageUseCase: GetPhotosByPageUseCase

    val pagedPhotos: Flow<PagingData<MarsPhoto>> = Pager(
        config = PagingConfig(pageSize = PAGE_SIZE),
        pagingSourceFactory = {
            PhotosPagingSource(
                getParam = { page -> getParamForRequestByPage(page) },
                getPhotosByPage = { param -> getPhotosByPage(param) }
            )
        }
    ).flow.cachedIn(viewModelScope)

    private suspend fun getPhotosByPage(param: GetPhotosByPageParam): List<MarsPhoto> {
        return getPhotosByPageUseCase.execute(param)
    }

    private fun getParamForRequestByPage(page: Int): GetPhotosByPageParam {
        return GetPhotosByPageParam(page)
    }
}