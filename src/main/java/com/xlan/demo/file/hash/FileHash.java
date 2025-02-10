package com.xlan.demo.file.hash;

import com.xlan.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
