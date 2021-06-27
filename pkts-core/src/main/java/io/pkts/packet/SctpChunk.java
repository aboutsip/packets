package io.pkts.packet;

import java.util.List;

public interface SctpChunk {

    List<SctpChunk> getChunks();
}
