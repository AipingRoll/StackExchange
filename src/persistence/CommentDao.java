package persistence;

import domain.Comment;

/**
 * Created by 温 睿诚 on 2016/4/12/0012.
 */
public interface CommentDao {
    Comment findCommentByOrderId(String orderId);
    Comment findCommentByBuyerId(String buyerId);
    Comment findCommentByProductId(String productId);
    int insertComment(Comment comment);
    int editCommentByCommentId(String commentId);
}
