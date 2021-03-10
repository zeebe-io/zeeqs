package io.zeebe.zeeqs.data.repository

import io.zeebe.zeeqs.data.entity.Error
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface ErrorRepository: PagingAndSortingRepository<Error, Long> {
}