package app.mistercooper.data.comment.remote.dto.mapper

import app.mistercooper.data.comment.remote.dto.response.CommentDTO
import app.mistercooper.data.comment.remote.dto.response.CommentResponseDTO
import app.mistercooper.domain.comment.model.CommentWrapperModel
import app.mistercooper.domain.common.feature.user.model.UserModel
import app.mistercooper.domain.common.utils.convertDateFromServer

fun CommentDTO.toModel() = app.mistercooper.domain.comment.model.CommentModel(
    content,
    createTime.convertDateFromServer(),
    UserModel(
        id = user.id,
        userName = user.name,
        imageProfileUrl = user.profileImage
    )
)

fun CommentResponseDTO.toModel() = CommentWrapperModel(
    imageUrl,
    comments.map { comment -> comment.toModel() })