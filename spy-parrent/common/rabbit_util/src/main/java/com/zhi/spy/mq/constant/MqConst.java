package com.zhi.spy.mq.constant;

public class MqConst {
    /**
     * 消息补偿
     */
    public static final String MQ_KEY_PREFIX = "spy.mq:list";
    public static final int RETRY_COUNT = 3;

    /**
     * 商品上下架
     */
    public static final String EXCHANGE_GOODS_DIRECT = "spy.goods.direct";
    public static final String ROUTING_GOODS_UPPER = "spy.goods.upper";
    public static final String ROUTING_GOODS_LOWER = "spy.goods.lower";
    //队列
    public static final String QUEUE_GOODS_UPPER  = "spy.goods.upper";
    public static final String QUEUE_GOODS_LOWER  = "spy.goods.lower";

    /**
     * 团长上下线
     */
    public static final String EXCHANGE_LEADER_DIRECT = "spy.leader.direct";
    public static final String ROUTING_LEADER_UPPER = "spy.leader.upper";
    public static final String ROUTING_LEADER_LOWER = "spy.leader.lower";
    //队列
    public static final String QUEUE_LEADER_UPPER  = "spy.leader.upper";
    public static final String QUEUE_LEADER_LOWER  = "spy.leader.lower";

    //订单
    public static final String EXCHANGE_ORDER_DIRECT = "spy.order.direct";
    public static final String ROUTING_ROLLBACK_STOCK = "spy.rollback.stock";
    public static final String ROUTING_MINUS_STOCK = "spy.minus.stock";

    public static final String ROUTING_DELETE_CART = "ssyx.delete.cart";
    //解锁普通商品库存
    public static final String QUEUE_ROLLBACK_STOCK = "spy.rollback.stock";
    public static final String QUEUE_SECKILL_ROLLBACK_STOCK = "spy.seckill.rollback.stock";
    public static final String QUEUE_MINUS_STOCK = "spy.minus.stock";
    public static final String QUEUE_DELETE_CART = "spy.delete.cart";

    //支付
    public static final String EXCHANGE_PAY_DIRECT = "spy.pay.direct";
    public static final String ROUTING_PAY_SUCCESS = "spy.pay.success";
    public static final String QUEUE_ORDER_PAY  = "spy.order.pay";
    public static final String QUEUE_LEADER_BILL  = "spy.leader.bill";

    //取消订单
    public static final String EXCHANGE_CANCEL_ORDER_DIRECT = "spy.cancel.order.direct";
    public static final String ROUTING_CANCEL_ORDER = "spy.cancel.order";
    //延迟取消订单队列
    public static final String QUEUE_CANCEL_ORDER  = "spy.cancel.order";

    /**
     * 定时任务
     */
    public static final String EXCHANGE_DIRECT_TASK = "spy.exchange.direct.task";
    public static final String ROUTING_TASK_23 = "spy.task.23";
    //队列
    public static final String QUEUE_TASK_23  = "spy.queue.task.23";
}