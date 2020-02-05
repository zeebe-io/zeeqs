package io.zeebe.zeeqs.data.repository

import io.zeebe.zeeqs.data.entity.WorkflowInstance
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface WorkflowInstanceRepository : PagingAndSortingRepository<WorkflowInstance, Long> {

    fun findByParentWorkflowInstanceKey(parentWorkflowInstanceKey: Long): List<WorkflowInstance>

}