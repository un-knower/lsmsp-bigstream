package cn.lsmsp.sparkframe.transform.decode

import cn.lsmsp.sparkframe.common.log.Logging
import kafka.serializer.Decoder

/**
  * Created by wangcongjun on 2017/4/14.
  */
class LinkFlowDecoder extends Decoder[String] with Logging{
  override def fromBytes(bytes: Array[Byte]): String = ???
}
